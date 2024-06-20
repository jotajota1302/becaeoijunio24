package edu.eoi.es.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "descripciones",schema = "beca")
@Getter
@Setter
public class Description {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="descripcion")
	private String description;
	
	@Column(name = "usuario")
	private String user;
	
	@Column(name = "fecha")
	private Date date;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "producto_id", referencedColumnName = "id")
	private Product product;	
	

}
