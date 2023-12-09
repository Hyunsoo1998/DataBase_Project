package com.example.damoaRecipe.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ingredient")
public class Ingredient {

    @Id
    @Column(name = "ingredient_id", length = 255)
    private String ingredientId;

    @Column(name = "ingredient_unit", length = 30)
    private String ingredientUnit;

    @Column(name = "ingredient_calorie")
    private int ingredientCalorie;

    // Getters and setters

    public String getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(String ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getIngredientUnit() {
        return ingredientUnit;
    }

    public void setIngredientUnit(String ingredientUnit) {
        this.ingredientUnit = ingredientUnit;
    }

    public int getIngredientCalorie() {
        return ingredientCalorie;
    }

    public void setIngredientCalorie(int ingredientCalorie) {
        this.ingredientCalorie = ingredientCalorie;
    }
    @Override
    public String toString() {
        return "Member{" +
                "ingredientId='" + getIngredientId() + '\'' +
                ", ingredient_unit='" + getIngredientUnit() + '\''+
                ", IngredientId='" + getIngredientId() + '\'' +
                ", ingredient_calorie='" + getIngredientCalorie() + '\'' +

                '}';
    }
}