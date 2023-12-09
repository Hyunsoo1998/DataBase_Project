package com.example.damoaRecipe.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Getter
public class Recipe {



    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long recipeId; //레시피 아이디
    @Column(name="recipe_author_id")
    private String recipeAuthorId; //레시피 작성자
    @Column(name="recipe_name")
    private String recipeName; //레시피 제목
    @Column(name="recipe_content")
    private String recipeContent; //레시피 내용
    @Column(name="recipe_calorie")
    private String recipeCalorie; //음식 칼로리
    @Column(name="recipe_cooking_time")
    private String recipeCookingTime; //음식 만드는 시간
    @Column(name="recipe_level")
    private Integer recipeLevel; //레시피 난이도
    @Column(name="recipe_like")
    private Integer recipeLike; //레시피 좋아요 수
    @CreationTimestamp
    @Column(name="recipe_created_at")
    private LocalDateTime recipeCreatedAt; //레시피 생성 시간
    @UpdateTimestamp
    @Column(name="recipe_updated_at")
    private LocalDateTime recipeUpdatedAt; //레시피 업데이트 시간

    @Column(name="recipe_status")
    public Integer recipeStatus; //레시피 상태



    public void recipeLike(){
        recipeLike++;
    }

    public void patch(Recipe recipe) { // 수정할 내용이 있는 경우 값을 갱신
        if(recipe.recipeName != null) this.recipeName =recipe.recipeName;
        if(recipe.recipeContent != null) this.recipeContent=recipe.recipeContent;
        if(recipe.recipeCalorie != null) this.recipeCalorie=recipe.recipeCalorie;
        if(recipe.recipeCookingTime != null) this.recipeCookingTime=recipe.recipeCookingTime;
        if(recipe.recipeLevel != null) this.recipeLevel=recipe.recipeLevel;
        if(recipe.recipeLike != null) this.recipeLike=recipe.recipeLike;
        // if(recipe.recipeImage != null) this.recipeImage=recipe.recipeImage; 이미지 변경사항
    }
}