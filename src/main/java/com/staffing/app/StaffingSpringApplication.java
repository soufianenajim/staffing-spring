package com.staffing.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.staffing")

@SpringBootApplication
public class StaffingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(StaffingSpringApplication.class, args);
	}
}
