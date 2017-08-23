package com.vstevam.gigabyte.facade;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.vstevam.gigabyte.dao.IngredientDAO;
import com.vstevam.gigabyte.dao.SnackDAO;
import com.vstevam.gigabyte.entities.Ingredient;
import com.vstevam.gigabyte.entities.Snack;
import com.vstevam.gigabyte.service.MenuService;
import com.vstevam.gigabyte.service.RequestService;

@Path("/request")
public class RequestFacade {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public double allIngredientsSnack(ArrayList<Ingredient> ingredients) {
		RequestService requestService = new RequestService();
		
		return requestService.requestValueTotal(ingredients);
	}
}

