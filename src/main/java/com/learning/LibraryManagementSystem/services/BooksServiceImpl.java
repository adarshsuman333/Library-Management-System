package com.learning.LibraryManagementSystem.services;

import com.learning.LibraryManagementSystem.entity.Books;
import com.learning.LibraryManagementSystem.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServiceImpl implements BooksService{

    @Autowired
    private BooksRepository booksRepository;

    @Override
    public List<Books> findAllBooks() {
        return booksRepository.findAll();
    }

    public Books findBookById(Long id) {
        Books books = booksRepository.findById(id).orElseThrow(() -> new RuntimeException("Books with id " + id + " not found!"));
        return books;
    }

    public void createBook(Books books){
        booksRepository.save(books);
    }

    public void removeBookById(Long id){
        Books books = booksRepository.findById(id).orElseThrow(() -> new RuntimeException("Books with id " + id + " not found!"));
        booksRepository.deleteById(books.getId());
    }

}
