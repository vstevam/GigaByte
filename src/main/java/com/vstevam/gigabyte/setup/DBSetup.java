package com.vstevam.gigabyte.setup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.vstevam.gigabyte.connectionfactory.DerbyConnectionFactory;
import com.vstevam.gigabyte.entities.Ingredient;
import com.vstevam.gigabyte.entities.Snack;
import com.vstevam.gigabyte.entities.SnackIngredients;

public class DBSetup {
	
	public static void main(String[] args) {
	 EntityManagerFactory factory = Persistence.createEntityManagerFactory("gigabyte");
	 EntityManager manager = factory.createEntityManager();
	    EntityTransaction trx = manager.getTransaction();
	    trx.begin();

        Ingredient alface = new Ingredient();
        Ingredient bacon = new Ingredient();
        Ingredient ovo = new Ingredient();
        Ingredient queijo = new Ingredient();
        Ingredient hamburguer = new Ingredient();
        Snack xBurguer = new Snack();
        Snack xBacon = new Snack();
        Snack xEgg = new Snack();
        Snack xEggBacon = new Snack();
        
        //Snack and Ingredients xBuguer
        SnackIngredients xBurguerHam = new SnackIngredients();
        xBurguerHam.setIdSnack(xBurguer.getId());
        xBurguerHam.setIdIngredient(hamburguer.getId());
        SnackIngredients xBurguerQueijo = new SnackIngredients();
        xBurguerQueijo.setIdSnack(xBurguer.getId());
        xBurguerQueijo.setIdIngredient(queijo.getId());
        
        //Snack and Ingredients xBacon
        SnackIngredients xBaconBacon = new SnackIngredients();
        xBaconBacon.setIdSnack(xBacon.getId());
        xBaconBacon.setIdIngredient(bacon.getId());
        SnackIngredients xBaconHam = new SnackIngredients();
        xBaconHam.setIdSnack(xBacon.getId());
        xBaconHam.setIdIngredient(hamburguer.getId());
        SnackIngredients xBaconQueijo = new SnackIngredients();
        xBaconQueijo.setIdSnack(xBacon.getId());
        xBaconQueijo.setIdIngredient(queijo.getId());
        
        //Snack and Ingredients xBaconEgg
        SnackIngredients xBaconEggBacon = new SnackIngredients();
        xBaconEggBacon.setIdSnack(xEggBacon.getId());
        xBaconEggBacon.setIdIngredient(bacon.getId());
        SnackIngredients xBaconEggHam = new SnackIngredients();
        xBaconEggHam.setIdSnack(xEggBacon.getId());
        xBaconEggHam.setIdIngredient(hamburguer.getId());
        SnackIngredients xBaconEggQueijo = new SnackIngredients();
        xBaconEggQueijo.setIdSnack(xEggBacon.getId());
        xBaconEggQueijo.setIdIngredient(queijo.getId());
        SnackIngredients xBaconEggEgg = new SnackIngredients();
        xBaconEggEgg.setIdSnack(xEggBacon.getId());
        xBaconEggEgg.setIdIngredient(ovo.getId());
        
        
        //Snack and Ingredients xEgg
        SnackIngredients xEggEgg = new SnackIngredients();
        xEggEgg.setIdSnack(xEgg.getId());
        xEggEgg.setIdIngredient(ovo.getId());
        SnackIngredients xEggHam = new SnackIngredients();
        xEggHam.setIdSnack(xEgg.getId());
        xEggHam.setIdIngredient(hamburguer.getId());
        SnackIngredients xEggQueijo = new SnackIngredients();
        xEggQueijo.setIdSnack(xEgg.getId());
        xEggQueijo.setIdIngredient(queijo.getId());
        
       //Ingredients
        alface.setDescription("Alface");
        alface.setPrice(0.40);

        bacon.setDescription("Bacon");
        bacon.setPrice(2.00);

        ovo.setDescription("Ovo");
        ovo.setPrice(0.80);

        queijo.setDescription("Queijo");
        queijo.setPrice(1.50);

        hamburguer.setDescription("Hambúrguer de carne");
        hamburguer.setPrice(3.00);
        
        //Snacks
        xBurguer.setDescription("X-Burguer");
        xBacon.setDescription("X-Bacon");
        xEgg.setDescription("X-Bacon");
        xEggBacon.setDescription("X-Bacon");
        
        
        
        manager.persist(alface);
        manager.persist(bacon);
        manager.persist(ovo);
        manager.persist(hamburguer);
        manager.persist(queijo);
        manager.persist(xBurguer);
        manager.persist(xBacon);
        manager.persist(xEgg);
        manager.persist(xEggBacon);
        
        manager.persist(xBurguerHam);
        manager.persist(xBurguerQueijo);
        manager.persist(xBaconBacon);
        manager.persist(xBaconHam);
        manager.persist(xBaconQueijo);
        manager.persist(xBaconEggBacon);
        manager.persist(xBaconEggHam);
        manager.persist(xBaconEggQueijo);
        manager.persist(xBaconEggEgg);
        manager.persist(xEggEgg);
        manager.persist(xEggHam);
        manager.persist(xEggQueijo);
        
        trx.commit();

        System.out.println("Commit");
        
        //manager.close();
	 
	}
}
