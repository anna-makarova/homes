package com.example.diploma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DiplomaApplication {
	@GetMapping("/")
	public static void main(String[] args) {
		SpringApplication.run(DiplomaApplication.class, args);
	}
}
