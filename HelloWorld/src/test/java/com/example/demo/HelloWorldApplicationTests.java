package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloWorldApplicationTests {
	
	@Autowired
	HelloWorldService service;
	
	@Autowired
	Person person;

	@Test
	void contextLoads() {
		
		service.sayHello();
		
		System.out.println(person.getName());
	}

}
