package com.vstevam.gigabyte.service;

import java.util.List;

import com.vstevam.gigabyte.dao.IngredientDAO;
import com.vstevam.gigabyte.dao.SnackIngredientsDAO;
import com.vstevam.gigabyte.entities.Ingredient;
import com.vstevam.gigabyte.entities.Snack;
import com.vstevam.gigabyte.entities.SnackIngredients;

public class MenuService {
	Snack snack = new Snack();

	/**
	 * Get Snack Price by Ingredients
	 *
	 * @param snack
	 * @return The Snack price
	 */
	public double snackPrice(int snack) {
		double snackprice = 0;
		SnackIngredientsDAO SIDAO = new SnackIngredientsDAO();
		IngredientDAO IDAO = new IngredientDAO();

		List<Integer> si = SIDAO.getAllbySnack(snack);
		if (si.isEmpty()) {
			List<Ingredient> ingredients = IDAO.getAllbySnackIngredients(si);

			for (Ingredient ingredient : ingredients) {
				snackprice = snackprice + ingredient.getPrice();
			}
		}
		return snackprice;
	}

}
