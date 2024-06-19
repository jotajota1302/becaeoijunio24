package edu.eoi.es.dto;

import java.time.LocalDate;

public class ProductDto {
	
	private Integer id;
	
	private String name;
	
	private String description;
	
	private Double price;
	
	private Integer stock;
	
	private String category;
	
	private LocalDate creationDate;
	
	private LocalDate updateDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}

	public ProductDto(String name, String description, Double price, Integer stock, String category,
			LocalDate creationDate, LocalDate updateDate) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.stock = stock;
		this.category = category;
		this.creationDate = creationDate;
		this.updateDate = updateDate;
	}

	public ProductDto() {
		super();
	}
	
	
	
	
	

}
