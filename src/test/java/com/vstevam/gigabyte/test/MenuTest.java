package com.vstevam.gigabyte.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.vstevam.gigabyte.entities.Ingredient;
import com.vstevam.gigabyte.entities.Snack;
import com.vstevam.gigabyte.entities.SnackIngredients;
import com.vstevam.gigabyte.service.MenuService;

/**
*
* @author vstevam
*/
public class MenuTest {
   
   public MenuTest() {
   }

   MenuService menu;
   Snack snack;
   Snack xBurguer;
   SnackIngredients xBurguerHam;
   Ingredient queijo;
   Ingredient hamburguer;
   SnackIngredients xBurguerQueijo;

   @Before
   public void setUp() {
       menu = new MenuService();
       snack = new Snack();
	   xBurguer = new Snack();
	   xBurguer.setDescription("X-Burguer");
	   
       queijo = new Ingredient();
       queijo.setDescription("Queijo");
       queijo.setPrice(1.50);
       
       hamburguer = new Ingredient();
       hamburguer.setDescription("Hambúrguer de carne");
       hamburguer.setPrice(3.00);
	   
       //Snack and Ingredients xBuguer
       xBurguerHam = new SnackIngredients();
       xBurguerHam.setIdSnack(xBurguer.getId());
       xBurguerHam.setIdIngredient(hamburguer.getId());
       xBurguerQueijo = new SnackIngredients();
       xBurguerQueijo.setIdSnack(xBurguer.getId());
       xBurguerQueijo.setIdIngredient(queijo.getId());
   }
   
   
   //Test price some ingredients
   @Test
   public void snackPrice() {
       assertEquals(0.0, 0.0, menu.snackPrice(xBurguer));
   }
   

}

