package com.example.damoaRecipe.service;


import com.example.damoaRecipe.entity.Ingredient;
import com.example.damoaRecipe.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


import com.example.damoaRecipe.entity.Ingredient;
import com.example.damoaRecipe.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IngredientService {

    private final IngredientRepository ingredientRepository;

    @Autowired
    public IngredientService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    public List<Ingredient> getAllIngredients() {
        return ingredientRepository.findAll();
    }

    public Optional<Ingredient> getIngredientById(String ingredientId) {
        return ingredientRepository.findByIngredientId(ingredientId);
    }

    public Ingredient saveIngredient(Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }

    public void deleteIngredient(String ingredientId) {
        ingredientRepository.deleteById(ingredientId);
    }
}


