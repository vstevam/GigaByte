package com.vstevam.gigabyte.dao;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AbstractDAO {

	EntityManagerFactory factory = null;
	EntityManager entityManager = null;
	@Singleton
	public EntityManager getEntityManager() {
		if (this.entityManager == null) {
			factory = Persistence.createEntityManagerFactory("gigabyte");
			entityManager = factory.createEntityManager();
		}

		return entityManager;
	}
}
