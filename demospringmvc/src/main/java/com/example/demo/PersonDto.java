package com.example.demo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonDto {

	@JsonProperty(value = "dni")
	private String nif;

	private String nombre;

	private String apellidos;
	
	private List<String> direcciones;
	
	private String postalCode;

}
