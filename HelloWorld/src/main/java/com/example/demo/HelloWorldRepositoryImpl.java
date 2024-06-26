package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldRepositoryImpl implements HelloWorldRepository {
	
	@Override
	public void sayHello() {
		
		System.out.println("Hello from repository impl");
	}

}
