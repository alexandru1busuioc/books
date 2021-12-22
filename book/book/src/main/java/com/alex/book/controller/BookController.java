package com.alex.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alex.book.model.Book;
import com.alex.book.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
	
	private BookService bookService;
	
	@Autowired
	private BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@PostMapping("/saveBook")
	private Book saveBook(@RequestBody Book book) {
		return bookService.saveBook(book);
	}
	
	@GetMapping("/getAllBooks")
	private List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	
	@GetMapping("/getBook/{bookId}")
	private Book getBook(@PathVariable long bookId) {
		return bookService.getBook(bookId);
	}

	@DeleteMapping("deleteBook/{bookId}")
	private String deleteBook(@PathVariable long bookId) {
		return bookService.deleteBook(bookId);
	}
	
	@PostMapping("updateBook/{bookId}")
	private Book updateBook(@RequestBody Book book,@PathVariable long bookId) {
		return bookService.updateBook(book, bookId);
	}
}
