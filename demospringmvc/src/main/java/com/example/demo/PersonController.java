package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	
	@GetMapping	
	public List<Person> findAll() {
		
		List<Person> lista= new ArrayList<Person>();
		
		Person p= new Person();
		p.setDireccion("Address");
		p.setNombre("Jose Juan");
		p.setCiudad("Alicante");
		
		lista.add(p);
		lista.add(p);
		
		return lista;
	}
	
	@GetMapping("/{id}")
	public Person find(@PathVariable Integer id) {
		
		Person p= new Person();
		p.setId(id);
		p.setDireccion("Address");
		p.setNombre("Jose Juan");
		p.setCiudad("Alicante");		
		
		return p;
	}

}
