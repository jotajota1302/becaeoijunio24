package com.example.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "clientes")
@Getter
@Setter
@ToString
public class Client extends Person {

	@Column
	private String usuario;
	
	@Column
	private String contraseña;
	
	@Column
	private Date fechaAlta;
	
	
}
