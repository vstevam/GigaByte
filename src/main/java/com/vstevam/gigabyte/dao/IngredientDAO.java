package com.vstevam.gigabyte.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.vstevam.gigabyte.entities.Ingredient;
import com.vstevam.gigabyte.entities.SnackIngredients;

public class IngredientDAO extends AbstractDAO{
	
	EntityManager entityManager = this.getEntityManager();
	
	public List<Ingredient> getAll(){
		Query query = entityManager.createQuery("SELECT e FROM Ingredient e");
		return (List<Ingredient>) query.getResultList();
	}
	
	public List<Ingredient> getAllbySnackIngredients(List<Long> si){
		Query query = entityManager.createQuery("SELECT e FROM Ingredient e where e.id in :si");
		return (List<Ingredient>) query.setParameter("si", si).getResultList();
	}
	
	public Ingredient getAllbyIngredientsName(String ingredientName){
		Query query = entityManager.createQuery("SELECT e FROM Ingredient e where e.description = :ingredientName");
		return (Ingredient) query.setParameter("ingredientName", ingredientName).getResultList().get(0);
	}
}
