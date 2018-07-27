package com.staffing.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath*:dozer.xml")

public class StaffingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(StaffingSpringApplication.class, args);
	}
}
