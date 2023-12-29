package com.cleo.StudentManagementSystem;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@Slf4j
public class StudentManagementSystemApplication {

	public static void main(String[] args) {
		log.info("Started Student Management System");
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

}
