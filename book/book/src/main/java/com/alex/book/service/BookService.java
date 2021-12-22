package com.alex.book.service;

import java.util.List;

import com.alex.book.model.Book;

public interface BookService {

	public Book saveBook(Book book);

	public List<Book> getAllBooks();

	public Book getBook(long bookId);

	public String deleteBook(long bookId);

	public Book updateBook(Book book, long bookId);

}
