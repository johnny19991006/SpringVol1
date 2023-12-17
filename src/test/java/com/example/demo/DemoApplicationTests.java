package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private DemoService demoService;

	@Test
	void testTimeTraceAspect() {
		demoService.methodToBeTraced();
		// You can add assertions or further checks based on your requirements
	}

	@Test
	void testMethodWithoutTrace() {
		demoService.methodWithoutTrace();
		// You can add assertions or further checks based on your requirements
	}
}
