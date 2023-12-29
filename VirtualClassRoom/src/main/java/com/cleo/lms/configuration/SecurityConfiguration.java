package com.cleo.lms.configuration;


import com.cleo.lms.securityUtil.JwtAuthenticationEntryPoint;
import com.cleo.lms.securityUtil.JwtAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import static com.cleo.lms.securityUtil.SecurityConstants.H2_URL;
import static com.cleo.lms.securityUtil.SecurityConstants.SIGN_UP_URLS;
import static org.springframework.security.config.Customizer.withDefaults;
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(
        securedEnabled = true,
        jsr250Enabled = true,
        prePostEnabled = true
)
public class SecurityConfiguration  {
    @Autowired
    private JwtAuthenticationEntryPoint unauthorizedHandler;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Bean
    public JwtAuthenticationFilter jwtAuthenticationFilter() {return  new JwtAuthenticationFilter();}


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((authz) -> {
                            try {
                                authz

                                        .and()
                                        .cors()
                                        .and()
                                        .csrf()
                                        .disable()

                                        .exceptionHandling()
                                        .authenticationEntryPoint(unauthorizedHandler)
                                        .and()
                                        .sessionManagement()
                                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                                        .and()
                                        .headers()
                                        .frameOptions()
                                        .sameOrigin() //To enable H2 Database

                                        .and()
                                        .authorizeHttpRequests()
                                        .antMatchers(
                                                "/",
                                                "/favicon.ico",
                                                "/**/*.png",
                                                "/**/*.gif",
                                                "/**/*.svg",
                                                "/**/*.jpg",
                                                "/**/*.html",
                                                "/**/*.css",
                                                "/**/*.js"
                                        ).permitAll()
                                        .antMatchers(SIGN_UP_URLS).permitAll()
                                        .antMatchers(H2_URL).permitAll()
                                        .and()
                                        .addFilterBefore(jwtAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class)

                                ;
                            } catch (Exception e) {
                                throw new RuntimeException(e);
                            }
                        }
                ).httpBasic(withDefaults());
        return http.build();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

}
