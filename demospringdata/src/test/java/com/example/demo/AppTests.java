package com.example.demo;

import java.util.Calendar;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Pageable;

@SpringBootTest
class AppTests {

	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	ClientRepository clientRepository;
	
	@Test
	void myTest() {
			
		//CREATE
//		
//		Product product= new Product();
//		product.setNombre("PRUEBA");
//		product.setPrecio(45.0);
//		product.setStock(4);
//		product.setFecha(Calendar.getInstance().getTime());
//		
//		productRepository.save(product);
		
		//READ
				
		//OPTIONAL
		
//		Optional<Product> producto=productRepository.findById(7);
	
//		System.out.println(producto.get());		

		//UPDATE
		
//		producto.get().setNombre("ACTUALIZO NOMBRE");
		
//		productRepository.save(producto.get());
		
//		producto.get().setId(0);
		
//		productRepository.save(producto.get());
		
		
		//DELETE
		
//		productRepository.deleteById(12);
		
		
		//FIND ALL
		
//		List<Product> products = productRepository.findAll();	
//		
//		System.out.println(products);
				
//		System.out.println(productRepository.findByStockGreaterThan(3));
//		
//		System.out.println(clientRepository.findByNif("AAAAAAA"));
//		
//		System.out.println(clientRepository.findByNombreAndApellidos("JJ","Jimenez"));
//	
//		System.out.println(productRepository.findByFechaIsNull());
//		
//		System.out.println(productRepository.findByOrderByStockAsc());
		
//		System.out.println(clientRepository.findByCiudad("Madrid"));
		
//		System.out.println(clientRepository.countByCiudad("Madrid"));
		
		Client cliente= new Client();
		cliente.setNif("23423423");
		cliente.setNombre("JJ");
		cliente.setContraseña("password");
		
		clientRepository.save(cliente);
		
		System.out.println(clientRepository.findById(1));
		
	}

}
