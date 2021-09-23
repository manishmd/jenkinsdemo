package com.example.microservice1.microservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Microservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservice1Application.class, args);
	}
	
	@GetMapping("/test1")
	public String test1() {
		return "I am from Microservice1-test1";
	}
	
	@GetMapping("/test2")
	public String test2() {
		return "I am from Microservice1-test2";
	}

}
