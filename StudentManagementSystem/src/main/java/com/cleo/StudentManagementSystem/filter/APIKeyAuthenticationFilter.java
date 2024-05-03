package com.cleo.StudentManagementSystem.filter;

import com.cleo.StudentManagementSystem.domain.APIKeyAuthenticationToken;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

public class APIKeyAuthenticationFilter extends AbstractAuthenticationProcessingFilter {

    public APIKeyAuthenticationFilter(AuthenticationManager authenticationManager){
        super("/**");
        this.setAuthenticationManager(authenticationManager);
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException, IOException, ServletException {
        Optional<String> key = Optional.ofNullable(request.getHeader("x-api-key"));

        APIKeyAuthenticationToken optionalToken = key.
                map(APIKeyAuthenticationToken::new)
                .orElse(new APIKeyAuthenticationToken());
        return getAuthenticationManager().authenticate(optionalToken);


    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult)
            throws IOException, ServletException {
        SecurityContextHolder.getContext().setAuthentication(authResult);
        chain.doFilter(request,response);
    }
}
