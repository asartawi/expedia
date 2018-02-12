package com.expedia.hotels;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@EnableAutoConfiguration
@SpringBootApplication
public class ExpediaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpediaApplication.class, args);
	}	
}
