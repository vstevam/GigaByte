package com.vstevam.gigabyte.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.vstevam.gigabyte.entities.Snack;

public class SnackDAO extends AbstractDAO{
	
	EntityManager entityManager = this.getEntityManager();
	
	public List<Snack> getAll(){
		Query query = entityManager.createQuery("FROM Snack", Snack.class);
		return (List<Snack>) query.getResultList();
	}
	
}
