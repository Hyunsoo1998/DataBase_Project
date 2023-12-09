package com.example.damoaRecipe;

import com.example.damoaRecipe.entity.Category;
import com.example.damoaRecipe.repository.CategoryRepository;
import com.example.damoaRecipe.service.CategoryService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class CategoryServiceTest {

    @Mock
    private CategoryRepository categoryRepository;

    @InjectMocks
    private CategoryService categoryService;

    @Test
    public void testGetCategoryById() {
        // Arrange
        String categoryId = "1";
        Category category = new Category();
        category.setCategoryId(1L);
        category.setCategoryType("TestCategory");

        when(categoryRepository.findByCategoryId(categoryId)).thenReturn(Optional.of(category));

        // Act
        Optional<Category> result = categoryService.getCategoryById(categoryId);

        // Assert
        assertFalse(result.isEmpty());

        // Exception handling
        assertDoesNotThrow(() -> {
            Category actualCategory = result.orElseThrow();
            assertEquals(category.getCategoryId(), actualCategory.getCategoryId());
            assertEquals(category.getCategoryType(), actualCategory.getCategoryType());
        });
    }

}


