package io.hamza.recipemanagement.init;

import io.hamza.recipemanagement.chef.Chef;
import io.hamza.recipemanagement.chef.ChefService;
import io.hamza.recipemanagement.recipe.Recipe;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    private final ChefService chefService;

    public DataInitializer(ChefService chefService) {
        this.chefService = chefService;
    }

    @Override
    public void run(String... args) throws Exception {

        if(chefService.getNumberOfChefs() > 1) {
            System.out.println("Chefs already initialized!");
            return;
        }

        Chef chef1 = new Chef("Gordon Ramsay");
        Chef chef2 = new Chef("Jamie Oliver");
        Chef chef3 = new Chef("Anthony Bourdain");

        List<Recipe> chef1Recipes = Arrays.asList(
                new Recipe("Beef Wellington", "A classic British dish made with beef fillet, puff pastry, and mushroom duxelles."),
                new Recipe("Scrambled Eggs", "A simple breakfast dish made with eggs, butter, and salt."),
                new Recipe("Beef Burger", "A juicy burger made with high-quality beef, fresh vegetables, and a soft bun.")
        );

        List<Recipe> chef2Recipes = Arrays.asList(
                new Recipe("Spaghetti Carbonara", "A creamy pasta dish made with spaghetti, pancetta, eggs, and parmesan cheese."),
                new Recipe("Roast Chicken", "A classic roast chicken dish made with herbs, lemon, and garlic."),
                new Recipe("Fish and Chips", "A traditional British dish made with battered fish and deep-fried chips.")
        );

        chefService.createChefWithRecipes(chef1,chef1Recipes);
        chefService.createChefWithRecipes(chef2,chef2Recipes);
        chefService.createChefWithRecipes(chef3,new ArrayList<>());

    }
}
