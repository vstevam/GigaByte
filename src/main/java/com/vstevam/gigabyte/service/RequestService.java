package com.vstevam.gigabyte.service;

import java.util.ArrayList;

import com.vstevam.constants.Constants;
import com.vstevam.gigabyte.entities.Ingredient;

public class RequestService {

	PromotionService promotion = new PromotionService();

	/**
	 * Total of value request
	 *
	 * @param ingredients
	 * @return Price total promotion calc
	 */
	public double requestValueTotal(ArrayList<Ingredient> ingredients) {
		double sumValue = 0.0;
		for (Ingredient ingredient : ingredients) {
			sumValue = sumValue + ingredient.getPrice();
		}

		ArrayList<String> promotions = checkingPromotion(ingredients);

		if (!promotions.isEmpty()) {

			if (promotions.contains(Constants.PROMOTION_LIGHT)) {
				promotion.lightPromotion(sumValue);
			}
			if (promotions.contains(Constants.PROMOTION_LOT_MEAT)) {
				promotion.lotMeatPromotion(sumValue);
			}
			if (promotions.contains(Constants.PROMOTION_LOT_CHEESE)) {
				promotion.lotCheesePromotion(sumValue);
			}
			if (promotions.contains(Constants.PROMOTION_INFLATION)) {
				promotion.inflationPromotion(sumValue);
			}

			return sumValue;
		} else {
			return sumValue;
		}

	}

	/**
	 * Cheking the request have promotion
	 *
	 * @param sumValue
	 * @return Request Promotion
	 */
	private ArrayList<String> checkingPromotion(ArrayList<Ingredient> ingredients) {
		ArrayList<String> promotions = new ArrayList<String>();

		promotion.lightPromotion(promotions, ingredients);
		promotion.lotMeatPromotion(promotions, ingredients);
		promotion.lotCheesePromotion(promotions, ingredients);
		promotion.inflationPromotion(promotions, ingredients);

		return promotions;
	}
}
