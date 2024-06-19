package edu.eoi.es.service;

import java.sql.SQLException;

import edu.eoi.es.dao.ProductDaoJdbcImpl;
import edu.eoi.es.dto.ProductDto;

public class ProductService {

	private ProductDaoJdbcImpl dao= new ProductDaoJdbcImpl();

	public String insertProduct(ProductDto product) {

		try {
			dao.create(product);
		} catch (SQLException e) {
			return "Error en la query a BBDD";
		}

		return "El alta se ha realizado";
	}

}
