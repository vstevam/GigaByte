package com.vstevam.gigabyte.facade;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.vstevam.gigabyte.dao.IngredientDAO;
import com.vstevam.gigabyte.entities.Ingredient;

@Path("/allIngredients")
public class IngredientsFacade {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Ingredient> allIngredients() {
		IngredientDAO ingredientDAO = new IngredientDAO();
		
		return ingredientDAO.getAll();
	}
}
