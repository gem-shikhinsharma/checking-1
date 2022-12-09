package com.example.demoCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoCrud.entity.Book;
import com.example.demoCrud.service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService bookService;
	
	@GetMapping("/book")
	private List<Book> getAllBook(){
		return bookService.getAllBook();
		
	}
	@GetMapping("/book/{bookId}")
	private Book getBook(@PathVariable("bookId") int bookId) {
		return bookService.getBookById(bookId);
	}
	@DeleteMapping("/book{bookId}")
	private void deleteBook(@PathVariable("bookId") int bookId) { bookService.delete(bookId);}
	
	@PostMapping("/books")
	private int saveBook(@RequestBody Book book) {
		bookService.saveOrUpdate(book);
		return book.getBookISIN();
	}
	@PutMapping("/books")
	private Book update(@RequestBody Book book) {
		bookService.saveOrUpdate(book);
		return book;
	}
	
	

}
