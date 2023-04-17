package io.hamza.recipemanagement.recipe;

import com.fasterxml.jackson.annotation.JsonBackReference;
import io.hamza.recipemanagement.chef.Chef;
import jakarta.persistence.*;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String name;
    private String description;

    @ManyToOne
    @JsonBackReference
    private Chef chef;

    public Recipe() {
    }

    public Recipe(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Recipe(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }
}

