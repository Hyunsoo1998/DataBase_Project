package com.example.damoaRecipe.DTO;


import java.sql.Timestamp;

public class CategoryDTO {

    private Long categoryId;
    private String categoryType;
    private Timestamp categoryCreatedAt;
    private Timestamp categoryUpdatedAt;
    private byte categoryStatus;

    // 생성자, Getter, Setter 등을 추가할 수 있습니다.


    public CategoryDTO() {
    }

    public CategoryDTO(Long categoryId, String categoryType, Timestamp categoryCreatedAt, Timestamp categoryUpdatedAt, byte categoryStatus) {
        this.categoryId = categoryId;
        this.categoryType = categoryType;
        this.categoryCreatedAt = categoryCreatedAt;
        this.categoryUpdatedAt = categoryUpdatedAt;
        this.categoryStatus = categoryStatus;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public Timestamp getCategoryCreatedAt() {
        return categoryCreatedAt;
    }

    public void setCategoryCreatedAt(Timestamp categoryCreatedAt) {
        this.categoryCreatedAt = categoryCreatedAt;
    }

    public Timestamp getCategoryUpdatedAt() {
        return categoryUpdatedAt;
    }

    public void setCategoryUpdatedAt(Timestamp categoryUpdatedAt) {
        this.categoryUpdatedAt = categoryUpdatedAt;
    }

    public byte getCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(byte categoryStatus) {
        this.categoryStatus = categoryStatus;
    }

    @Override
    public String toString() {
        return "CategoryDTO{" +
                "categoryId=" + categoryId +
                ", categoryType='" + categoryType + '\'' +
                ", categoryCreatedAt=" + categoryCreatedAt +
                ", categoryUpdatedAt=" + categoryUpdatedAt +
                ", categoryStatus=" + categoryStatus +
                '}';
    }
}
