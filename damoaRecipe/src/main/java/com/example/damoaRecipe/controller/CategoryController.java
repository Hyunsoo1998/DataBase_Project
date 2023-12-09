package com.example.damoaRecipe.controller;


import com.example.damoaRecipe.entity.Category;
import com.example.damoaRecipe.exception.DataNotFoundException;
import com.example.damoaRecipe.repository.CategoryRepository;
import com.example.damoaRecipe.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categories")
public class CategoryController {


    private final CategoryService categoryService;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
    // 카테고리 조회 API
    @GetMapping("/{categoryId}")
    public Category getCategoryById(@PathVariable Long categoryId) {
        Optional<Category> categoryOptional = categoryService.getCategoryById(categoryId.toString());
        return categoryOptional.orElseThrow(() -> new DataNotFoundException("Category not found with ID: " + categoryId));
    }

    //  API를 추가부분

    


    // 예외 처리 추가
    @ExceptionHandler(DataNotFoundException.class)
    public ResponseEntity<String> handleDataNotFoundException(DataNotFoundException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
}

