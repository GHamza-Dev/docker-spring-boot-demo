package io.hamza.recipemanagement.chef;

import io.hamza.recipemanagement.recipe.Recipe;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Chef {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "chef")
    private List<Recipe> recipes;

    public Chef() {
    }

    public Chef(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Chef(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }
}
