package com.learning.LibraryManagementSystem.services;

import com.learning.LibraryManagementSystem.entity.Category;

import java.util.List;

public interface CategoryService {
    public List<Category> getAllCategories();
    public Category getCategoryById(Long id);
    public void createCategory(Category category);
    public void updateCategory(Category category);
    public void deleteCategory(Long id);
}
