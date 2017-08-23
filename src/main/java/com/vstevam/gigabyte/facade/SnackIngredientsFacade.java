package com.vstevam.gigabyte.facade;

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

@Path("/snackPrice")
public class SnackIngredientsFacade {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public double allIngredientsSnack(Snack snack) {
		MenuService menuService = new MenuService();
		
		return menuService.snackPrice(snack);
	}
}

