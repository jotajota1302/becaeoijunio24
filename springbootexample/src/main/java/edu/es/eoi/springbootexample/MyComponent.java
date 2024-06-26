package edu.es.eoi.springbootexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "load" , havingValue = "true")
public class MyComponent {
	
	private static Logger logger=LoggerFactory.getLogger(MyComponent.class);
	
	@Value("${datasource.url}")
	public String myName;

	public void doSomething() {
		
		logger.debug("entro en el metodo");

		System.out.println("do something: " + myName);
		
		logger.debug("salgo del metodo");
	}
	
}
