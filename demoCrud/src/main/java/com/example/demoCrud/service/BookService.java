package com.example.demoCrud.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demoCrud.entity.Book;
import com.example.demoCrud.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepository;
	public List<Book> getAllBook(){
		List<Book> book= new ArrayList<Book>();
		bookRepository.findAll().forEach(book1 -> book.add(book1));
		return book;
	}
	public com.example.demoCrud.entity.Book getBookById(int id) {
		return bookRepository.findById(id).get();
		
	}
	public void delete(int id) {
		bookRepository.deleteById(id);
		
	}

	public void saveOrUpdate(com.example.demoCrud.entity.Book book) {
		bookRepository.save(book);
		
	}
	public void update(Book book, int Id) {
		bookRepository.save(book);
	}

}
