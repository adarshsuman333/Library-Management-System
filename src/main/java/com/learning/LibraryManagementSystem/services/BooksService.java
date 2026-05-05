package com.learning.LibraryManagementSystem.services;

import com.learning.LibraryManagementSystem.entity.Books;

import java.util.List;

public interface BooksService {
    public List<Books> findAllBooks();
    public Books findBookById(Long id);
    public void createBook(Books books);
    public void removeBookById(Long id);
}
