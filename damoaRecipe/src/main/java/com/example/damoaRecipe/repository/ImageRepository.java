package com.example.damoaRecipe.repository;

import com.example.damoaRecipe.entity.Image;
import com.example.damoaRecipe.entity.Ingredient;
import com.example.damoaRecipe.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ImageRepository extends JpaRepository<Image, String> {

    Optional<Image> findByImage1(String image1);
    // 원하는 이미지 필드에 따라 findByImage2, findByImage3 등을 추가할 수 있다.

}
