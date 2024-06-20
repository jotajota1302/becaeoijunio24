package edu.eoi.es.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import edu.eoi.es.entity.Description;

public class DescriptionDaoJpaImpl {

	private EntityManager em = Persistence.createEntityManagerFactory("BECA_PU").createEntityManager();

	public Description read(int id) {
		return em.find(Description.class, id);
	}

	public void create(Description description) {
		em.getTransaction().begin();
		em.persist(description);
		em.getTransaction().commit();
	}

	public void update(Description description) {
		em.getTransaction().begin();
		em.merge(description);
		em.getTransaction().commit();
	}

	public void delete(Description description) {
		em.getTransaction().begin();
		em.remove(description);
		em.getTransaction().commit();
	}
}
