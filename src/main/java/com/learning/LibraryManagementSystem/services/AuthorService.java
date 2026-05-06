package com.learning.LibraryManagementSystem.services;

import com.learning.LibraryManagementSystem.entity.Author;

import java.util.List;

public interface AuthorService {
    public List<Author> getAllAuthors();
    public Author getAuthorById(Long id);
    public void createAuthor(Author author);
    public void updateAuthor(Author author);
    public void deleteAuthor(Long id);
}
