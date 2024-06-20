package edu.eoi.es.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import edu.eoi.es.entity.Order;

public class OrderDaoJpaImpl {

	private EntityManager em = Persistence.createEntityManagerFactory("BECA_PU").createEntityManager();

	public Order read(int id) {
		return em.find(Order.class, id);
	}

	public void create(Order order) {
		em.getTransaction().begin();
		em.persist(order);
		em.getTransaction().commit();
	}

	public void update(Order order) {
		em.getTransaction().begin();
		em.merge(order);
		em.getTransaction().commit();
	}

	public void delete(Order order) {
		em.getTransaction().begin();
		em.remove(order);
		em.getTransaction().commit();
	}
}
