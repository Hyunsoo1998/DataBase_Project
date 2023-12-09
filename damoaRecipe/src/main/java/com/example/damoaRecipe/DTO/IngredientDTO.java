package com.example.damoaRecipe.DTO;


public class IngredientDTO {

    private String ingredientId;
    private String ingredientUnit;
    private int ingredientCalorie;



    public IngredientDTO() {
    }

    public IngredientDTO(String ingredientId, String ingredientUnit, int ingredientCalorie) {
        this.ingredientId = ingredientId;
        this.ingredientUnit = ingredientUnit;
        this.ingredientCalorie = ingredientCalorie;
    }

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


    // 다른 필요한 메서드들을 추가할 수 있습니다.

    @Override
    public String toString() {
        return "IngredientDTO{" +
                "ingredientId='" + ingredientId + '\'' +
                ", ingredientUnit='" + ingredientUnit + '\'' +
                ", ingredientCalorie=" + ingredientCalorie +
                '}';
    }
}
