package com.devops.demo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDevopsDemoApplication {

	@GetMapping("/welcome")
	public String welcome() {
		return "Sprint boot application DevOps demo project";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDevopsDemoApplication.class, args);
	}

}
