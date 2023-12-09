package com.example.damoaRecipe.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


import java.sql.Timestamp;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "category_type", nullable = false, length = 30)
    private String categoryType;

    @Column(name = "category_created_at", nullable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp categoryCreatedAt;

    @Column(name = "category_updated_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp categoryUpdatedAt;

    @Column(name = "category_status", nullable = false)
    private byte categoryStatus;


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
        return "Category{" +
                "categoryId='" + getCategoryId() + '\'' +
                ", categoryType='" + getCategoryType() + '\'' +
                ", category_created_at='" + getCategoryCreatedAt() + '\'' +
                ", category_updated_at='" + getCategoryUpdatedAt() + '\'' +
                ", category_status='" + getCategoryStatus() + '\'' +
                '}';
    }
}
