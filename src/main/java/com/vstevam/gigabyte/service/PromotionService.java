package com.vstevam.gigabyte.service;

import java.util.ArrayList;

import com.vstevam.constants.Constants;
import com.vstevam.gigabyte.dao.IngredientDAO;
import com.vstevam.gigabyte.entities.Ingredient;

public class PromotionService {
	
	IngredientDAO ingredientDAO =  new IngredientDAO();

	/**
	 * Light Promotion - 10% discount
	 *
	 * @param sumValue
	 * @return Price with discount
	 */
	public double lightPromotion(double sumValue) {
		return sumValue - (sumValue * 0.1);
	}

	/**
	 * Meat Promotion - Each 3 meats the client pay 2
	 *
	 * @param sumValue
	 * @return Remove one meat
	 */
	public double lotMeatPromotion(double sumValue) {
		Ingredient meat = new Ingredient();
		
		meat = ingredientDAO.getAllbyIngredientsName(Constants.INGREDIENT_CHEESE);

		return sumValue - meat.getPrice();
	}

	/**
	 * Cheese Promotion - Each 3 cheese the client pay 2
	 *
	 * @param sumValue
	 * @return Remove one cheese
	 */
	public double lotCheesePromotion(double sumValue) {
		Ingredient cheese = new Ingredient();
		
		cheese = ingredientDAO.getAllbyIngredientsName(Constants.INGREDIENT_CHEESE);

		return sumValue - cheese.getPrice();
	}

	/**
	 * Inflation Promotion - Do not influence the tests
	 *
	 * @param sumValue
	 * @return Price with promotion
	 */
	public double inflationPromotion(double sumValue) {
		return 0;
	}

	/**
	 * Light Promotion - Cheking if snack do not have bacon and have lettuce
	 *
	 * @param promotions
	 * @param ingredients
	 * @return Promotion
	 */
	public ArrayList<String> lightPromotion(ArrayList<String> promotions, ArrayList<Ingredient> ingredients) {
		for (Ingredient ingredient : ingredients) {
			if (Constants.INGREDIENT_ALFACE.equals(ingredient.getDescription())
					&& Constants.INGREDIENT_BACON.equals(ingredient.getDescription())) {
				promotions.add(Constants.PROMOTION_LIGHT);
				return promotions;
			}
		}

		return promotions;

	}

	/**
	 * Meat Promotion - Cheking if snack have 3 meat or more
	 *
	 * @param promotions
	 * @param ingredients
	 * @return Promotion
	 */
	public ArrayList<String> lotMeatPromotion(ArrayList<String> promotions, ArrayList<Ingredient> ingredients) {
		int countMeat = 0;
		for (Ingredient ingredient : ingredients) {
			if (Constants.INGREDIENT_HAMBURGUER_MEAT.equals(ingredient.getDescription())) {
				countMeat++;
				if (countMeat == 3) {
					countMeat = 0;
					promotions.add(Constants.PROMOTION_LOT_MEAT);
				}

			}
		}
		return promotions;
	}

	/**
	 * Cheese Promotion - Cheking if snack have 3 cheese or more
	 *
	 * @param promotions
	 * @param ingredients
	 * @return Promotion
	 */
	public ArrayList<String> lotCheesePromotion(ArrayList<String> promotions, ArrayList<Ingredient> ingredients) {
		int countCheese = 0;
		for (Ingredient ingredient : ingredients) {
			if (Constants.INGREDIENT_CHEESE.equals(ingredient.getDescription())) {
				countCheese++;
				if (countCheese == 3) {
					countCheese = 0;
					promotions.add(Constants.PROMOTION_LOT_CHEESE);
				}

			}
		}
		return promotions;
	}

	/**
	 * Inflation Promotion - Os valores dos ingredientes são alterados com
	 * frequência não gastaríamos que isso influenciasse nos testes automatizados.
	 *
	 * @param promotions
	 * @param ingredients
	 * @return Promotion
	 */
	public ArrayList<String> inflationPromotion(ArrayList<String> promotions, ArrayList<Ingredient> ingredients) {
		return promotions;
	}

}
