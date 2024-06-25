package edu.eoi.es.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "productos", schema = "beca")
@Getter
@Setter
@ToString(exclude = "description")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "nombre")
	private String name;

	@OneToOne(mappedBy = "product",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Description description;
	
	@Column(name = "precio")
	private Double price;

	@Column(name = "stock")
	private Integer stock;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	
}
