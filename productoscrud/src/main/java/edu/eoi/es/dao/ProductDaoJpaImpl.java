package edu.eoi.es.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import edu.eoi.es.entity.Product;

public class ProductDaoJpaImpl {

	private EntityManager em = Persistence.createEntityManagerFactory("BECA_PU").createEntityManager();

	public Product read(int id) {
		return em.find(Product.class, id);
	}

	public void create(Product product) {
		em.getTransaction().begin();
		em.persist(product);
		em.getTransaction().commit();
	}

	public void update(Product product) {
		em.getTransaction().begin();
		em.merge(product);
		em.getTransaction().commit();
	}

	public void delete(Product product) {
		em.getTransaction().begin();
		em.remove(product);
		em.getTransaction().commit();
	}
}
