package com.example.damoaRecipe.controller;


import com.example.damoaRecipe.entity.Ingredient;
import com.example.damoaRecipe.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {

    private final IngredientService ingredientService;

    @Autowired
    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    // 모든 재료 조회 API
    @GetMapping("/{ingredient_all}")
    public List<Ingredient> getAllIngredients() {
        return ingredientService.getAllIngredients();
    }

    // 재료 조회 API
    @GetMapping("/{ingredientId}")
    public Ingredient getIngredientById(@PathVariable String ingredientId) {
        Optional<Ingredient> ingredientOptional = ingredientService.getIngredientById(ingredientId);
        return ingredientOptional.orElse(null);
    }

    // 재료 등록 API
    @PostMapping
    public Ingredient saveIngredient(@RequestBody Ingredient ingredient) {
        return ingredientService.saveIngredient(ingredient);
    }

    // 재료 삭제 API
    @DeleteMapping("/{ingredientId}")
    public void deleteIngredient(@PathVariable String ingredientId) {
        ingredientService.deleteIngredient(ingredientId);
    }

    // 다양한 재료 관련 API를 추가할 수 있습니다.

}
