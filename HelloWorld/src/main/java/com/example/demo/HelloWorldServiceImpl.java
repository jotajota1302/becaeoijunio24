package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldServiceImpl implements HelloWorldService {

	@Autowired
	HelloWorldRepository repository;
	
	@Override
	public void sayHello() {
		
		repository.sayHello();
	}
}
