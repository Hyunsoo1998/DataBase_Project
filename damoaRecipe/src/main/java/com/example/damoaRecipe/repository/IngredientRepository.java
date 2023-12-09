package com.example.damoaRecipe.repository;


import com.example.damoaRecipe.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IngredientRepository extends JpaRepository<Ingredient, String> {
    Optional<Ingredient> findByIngredientId(String ingredientId);
}


