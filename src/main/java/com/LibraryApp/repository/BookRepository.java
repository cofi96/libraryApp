package com.LibraryApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LibraryApp.models.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
