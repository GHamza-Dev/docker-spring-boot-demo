package io.hamza.recipemanagement.chef;

import io.hamza.recipemanagement.recipe.Recipe;
import io.hamza.recipemanagement.recipe.RecipeRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChefService {
    private ChefRepository chefRepository;
    private RecipeRepository recipeRepository;

    public ChefService(ChefRepository chefRepository, RecipeRepository recipeRepository) {
        this.chefRepository = chefRepository;
        this.recipeRepository = recipeRepository;
    }

    @Transactional
    public Chef createChefWithRecipes(Chef chef, List<Recipe> recipes){

        recipes.stream().forEach(recipe -> recipe.setChef(chef));

        this.chefRepository.save(chef);
        this.recipeRepository.saveAll(recipes);

        return chef;
    }

    public List<Chef> getChefs(){
        System.out.println(this.chefRepository.findAll());
        return this.chefRepository.findAll();
    }

    public Long getNumberOfChefs(){
        return this.chefRepository.count();
    }
}
