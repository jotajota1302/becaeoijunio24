package com.example.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "proveedores")
@Getter
@Setter
@ToString
public class Provider extends Person {

	@Column
	private String cif;
	
	@Column
	private String tipoProveedor;
	
	@Column
	private Date fechaAlta;
	
	
}
