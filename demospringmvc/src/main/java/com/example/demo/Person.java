package com.example.demo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "Personas")
@Getter
@Setter
@ToString
public class Person {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String nif;
	
	@Column
	private String nombre;
	
	@Column
	private String apellidos;
	
	@OneToMany(targetEntity = Person.class)
	private List<Address> direcciones;	
	
	@Column
	private String ciudad;
	


}
