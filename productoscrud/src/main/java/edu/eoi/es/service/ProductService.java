package edu.eoi.es.service;



import edu.eoi.es.dao.ProductDaoJpaImpl;
import edu.eoi.es.entity.Product;

public class ProductService {

//	private ProductDaoJdbcImpl dao= new ProductDaoJdbcImpl();
	
	private ProductDaoJpaImpl dao= new ProductDaoJpaImpl();

	
	public Product findProduct(int id) {

		return dao.read(id);
	}

}
