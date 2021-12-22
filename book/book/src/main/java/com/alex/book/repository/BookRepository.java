package com.alex.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alex.book.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
