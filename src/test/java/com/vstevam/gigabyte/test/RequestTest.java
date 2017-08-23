package com.vstevam.gigabyte.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.vstevam.gigabyte.entities.Ingredient;
import com.vstevam.gigabyte.entities.Snack;
import com.vstevam.gigabyte.service.MenuService;
import com.vstevam.gigabyte.service.RequestService;

/**
 *
 * @author vstevam
 */
public class RequestTest {

	public RequestTest() {
	}

	RequestService request;
	ArrayList<Ingredient> ingredients;

	@Before
	public void setUp() {
		request = new RequestService();
		ingredients = new ArrayList<Ingredient>();
	}

	// Request Value Total by Ingredients
	@Test
	public void requestValueTotal() {
		Ingredient ham = new Ingredient();
		Ingredient cheese = new Ingredient();
		
		cheese.setDescription("Queijo");
		cheese.setPrice(1.50);
		
		ingredients.add(cheese);

		ham.setDescription("Hamburguer de carne");
		ham.setPrice(3.00);
		
		ingredients.add(ham);
		
		assertEquals(4.5, 4.5, request.requestValueTotal(ingredients));
	}

}
