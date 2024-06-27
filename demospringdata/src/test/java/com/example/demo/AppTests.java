package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppTests {

	@Autowired
	ProductRepository productRepository;
	
	@Test
	void myTest() {
		
		System.out.println(productRepository.count());
		System.out.println(productRepository.existsById(4));
		System.out.println(productRepository.findAll());
		
	}

}
