package com.app.gym.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class GymAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymAppApplication.class, args);
	}

}
