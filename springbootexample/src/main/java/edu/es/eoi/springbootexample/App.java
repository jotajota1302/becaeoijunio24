package edu.es.eoi.springbootexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner{

	@Autowired
	MyComponent component;
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);	
	}

	@Override
	public void run(String... args) throws Exception {
		
		component.doSomething();

	}
	
	

}
