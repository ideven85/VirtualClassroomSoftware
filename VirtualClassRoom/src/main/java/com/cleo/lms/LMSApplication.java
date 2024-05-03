package com.cleo.lms;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EnableEurekaClient
@Slf4j
public class LMSApplication {
    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @GetMapping("/")
    public String index(){
        log.warn("Same origin");
        return "index";
    }
    public static void main(String[] args) {
        SpringApplication.run(LMSApplication.class, args);
    }

}
