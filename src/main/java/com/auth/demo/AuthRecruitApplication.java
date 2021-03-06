package com.auth.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
@SpringBootApplication
@EnableEurekaClient
@CrossOrigin(origins = "http://localhost:4200")
public class AuthRecruitApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthRecruitApplication.class, args);
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}


}
