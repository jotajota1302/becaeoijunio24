package com.example.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	
	@Column
	private String nif;
	
	@Column
	private String nombre;
	
	@Column
	private String apellidos;
	
	@Column
	private String direccion;	
	
	@Column
	private String ciudad;
	
	private Date fechaNacimiento;

}
