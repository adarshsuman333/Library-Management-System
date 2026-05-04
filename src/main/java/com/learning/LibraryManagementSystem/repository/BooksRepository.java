package com.learning.LibraryManagementSystem.repository;

import com.learning.LibraryManagementSystem.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends JpaRepository<Books, Long> {

}
