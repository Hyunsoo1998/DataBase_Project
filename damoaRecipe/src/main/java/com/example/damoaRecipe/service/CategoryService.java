package com.example.damoaRecipe.service;


import com.example.damoaRecipe.entity.Category;
import com.example.damoaRecipe.entity.Member;
import com.example.damoaRecipe.exception.DataNotFoundException;
import com.example.damoaRecipe.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;


@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;



    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Optional<Category> getCategoryById(String categoryId) {
        return categoryRepository.findByCategoryId(categoryId);
    }



}
