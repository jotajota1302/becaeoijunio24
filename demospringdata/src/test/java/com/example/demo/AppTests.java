package com.example.demo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppTests {

	@Autowired
	ProductRepository productRepository;
	
	@Test
	void myTest() {
			
		//CREATE
		
		Product product= new Product();
		product.setNombre("PRUEBA");
		product.setPrecio(45.0);
		product.setStock(4);
		
//		productRepository.save(product);
		
		//READ
				
		//OPTIONAL
		
		Optional<Product> producto=productRepository.findById(7);
	
		System.out.println(producto.get());
		
		
		//UPDATE
		
		producto.get().setNombre("ACTUALIZO NOMBRE");
		
		productRepository.save(producto.get());
		
//		producto.get().setId(0);
		
//		productRepository.save(producto.get());
		
		
		//DELETE
		
		productRepository.deleteById(12);
		
	}

}
