package com.week8.week8_practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@SpringBootApplication
public class Week8PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(Week8PracticeApplication.class, args);
	}

	@GetMapping(value = "/")
	@Timer
	public String doGetHelloWorld() {
		return "Hello World!!!!";
	}

	@GetMapping(value = "/demo")
	@Timer
	public String doGetHelloWorldDemo() {
		return "Hello World (Demo)";
	}

}
