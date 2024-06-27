package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

	public List<Product> findByStockGreaterThan(int valor);
	
	public List<Product> findByFechaIsNull();
	
	public List<Product> findByOrderByStockAsc();
	
}
