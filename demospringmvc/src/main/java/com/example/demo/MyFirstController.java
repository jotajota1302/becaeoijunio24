package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class MyFirstController {

	@GetMapping
	@ResponseBody
	public Person findPerson() {
		
		Person p= new Person();
		p.setNombre("Jose Juan");
		p.setCiudad("Alicante");
		
		return p;
	}
	
	@PostMapping
	@ResponseBody
	public Person postPerson() {
		
		Person p= new Person();
		p.setNombre("Jose Juan- POST MAPPING");
		p.setCiudad("Alicante");
		
		return p;
	}
	
	
}
