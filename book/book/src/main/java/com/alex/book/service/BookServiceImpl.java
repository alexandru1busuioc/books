package com.alex.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.book.model.Book;
import com.alex.book.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{

	private BookRepository bookRepository;
	
	@Autowired
	private BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository=bookRepository;
	}

	@Override
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Book getBook(long bookId) {
		return bookRepository.getById(bookId);
	}

	@Override
	public String deleteBook(long bookId) {
		bookRepository.deleteById(bookId);
		return "Success";
	}

	@Override
	public Book updateBook(Book book, long bookId) {
		Book dbBook = bookRepository.findById(bookId).get();
		dbBook.setAuthor(book.getAuthor());
		dbBook.setPublisher(book.getPublisher());
		dbBook.setTitle(book.getTitle());
		dbBook.setPrice(book.getPrice());
		return dbBook;
	}
}
