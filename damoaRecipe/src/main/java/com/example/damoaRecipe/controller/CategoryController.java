package com.example.damoaRecipe.controller;


import com.example.damoaRecipe.entity.Category;
import com.example.damoaRecipe.exception.DataNotFoundException;
import com.example.damoaRecipe.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    // 카테고리 조회 API
    @GetMapping("/{categoryId}")
    public Category getCategoryById(@PathVariable Long categoryId) {
        Optional<Category> categoryOptional = categoryService.getCategoryById(categoryId.toString());
        return categoryOptional.orElseThrow(() -> new DataNotFoundException("Category not found with ID: " + categoryId));
    }

    // 다양한 카테고리 관련 API를 추가할 수 있습니다.

}

