package com.vstevam.gigabyte.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.vstevam.gigabyte.entities.Ingredient;
import com.vstevam.gigabyte.entities.Snack;
import com.vstevam.gigabyte.service.MenuService;
import com.vstevam.gigabyte.service.PromotionService;

/**
 *
 * @author vstevam
 */
public class PromotionTest {

	public PromotionTest() {
	}

	PromotionService promotion;
	ArrayList<Ingredient> ingredients;

	@Before
	public void setUp() {
		promotion = new PromotionService();
		ingredients = new ArrayList<Ingredient>();
	}

	// Test Light Promotion
	@Test
	public void lightPromotion() {
		assertEquals(9.0, 9.0, promotion.lightPromotion(10.0));
	}

	// Test Meat Promotion
	 @Test
	 public void lotMeatPromotion() {
	 assertEquals(8.5, 8.5, promotion.lotMeatPromotion(10.0));
	 }

	// Test Cheese Promotion
	 @Test
	 public void lotCheesePromotion() {
	 assertEquals(5.0, 5.0, promotion.lotCheesePromotion(6.5));
	 }

	// Test Infration Promotion
	@Test
	public void inflationPromotion() {
		assertEquals(0.0, 0.0, promotion.inflationPromotion(0.0));
	}

}
