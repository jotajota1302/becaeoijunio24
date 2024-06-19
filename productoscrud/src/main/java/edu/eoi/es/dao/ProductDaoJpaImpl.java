package edu.eoi.es.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import edu.eoi.es.entity.Product;

public class ProductDaoJpaImpl {
	
	
	public Product read(int id) {
		
		EntityManager em = Persistence.createEntityManagerFactory("BECA_PU").createEntityManager();
				
		return em.find(Product.class, id);
	}

}
