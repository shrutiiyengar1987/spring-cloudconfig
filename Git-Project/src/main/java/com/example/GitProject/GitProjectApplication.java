package com.example.GitProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
@RestController
public class GitProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitProjectApplication.class, args);
	}
	@RequestMapping("/greet")
	public String greetWorld() {
		return "Greetings!Have a great day";
	}
	
	@RequestMapping("/birthday")
	public String birthdayWishes() {
		return "Wishing you a very Happy birthday!!!!!!!!!!!";
	}
	

}
