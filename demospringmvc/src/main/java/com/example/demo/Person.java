package com.example.demo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class Person {	
	
	private int id;
	
	private String nif;
	
	private String nombre;
	
	private String apellidos;
	
	private String direccion;	
	
	private String ciudad;
	
	private Date fechaNacimiento;

}
