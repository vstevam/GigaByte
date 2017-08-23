package com.vstevam.gigabyte.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.vstevam.gigabyte.entities.Snack;
import com.vstevam.gigabyte.entities.SnackIngredients;

public class SnackIngredientsDAO extends AbstractDAO{
	
	EntityManager entityManager = this.getEntityManager();
	
	public List<SnackIngredients> getAll(){
		Query query = entityManager.createQuery("SELECT e FROM SnackIngredients e");
		return (List<SnackIngredients>) query.getResultList();
	}
	
	
	public List<Integer> getAllbySnack(Snack snack){
		Query query = entityManager.createQuery("SELECT e.idIngredient FROM SnackIngredients e WHERE e.idSnack = :snackId");
		return (List<Integer>) query.setParameter("snackId", snack.getId()).getResultList();
	}
}
