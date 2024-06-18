package edu.eoi.es.service;

import java.sql.SQLException;

import edu.eoi.es.dao.ProductDao;
import edu.eoi.es.dto.Product;

public class ProductService {

	private ProductDao dao= new ProductDao();

	public String insertProduct(Product product) {

		try {
			dao.createProduct(product);
		} catch (SQLException e) {
			return "Error en la query a BBDD";
		}

		return "El alta se ha realizado";
	}

}
