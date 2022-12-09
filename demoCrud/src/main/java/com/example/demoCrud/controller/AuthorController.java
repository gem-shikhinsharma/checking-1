package com.example.demoCrud.controller;

import java.util.List;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoCrud.entity.Author;
import com.example.demoCrud.service.AuthorService;

import ch.qos.logback.classic.Logger;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@RestController

public class AuthorController {
	@Autowired
	AuthorService authorService;
	
	Logger log = LoggerFactory.getLogger(AuthorController.class);
	
	@GetMapping("/author")
	private List<Author> getAllAuthor(){
		log.info("Welcome Page Loaded"); 
		return authorService.getAllAuthor();
		
	}
	@GetMapping("/author/{authorId}")
	private Author getAuthor(@PathVariable("authorId")int authorId) {
		return authorService.getAuthorById(authorId);

	}
	@DeleteMapping("/author/{authorId}")
	private void deleteAuthor(@PathVariable("authorId") int authorId) { authorService.delete(authorId); }
	
	@PostMapping("/authors")
	private int saveAuthor(@RequestBody Author author) {
		authorService.saveOrUpdate(author);
		return author.getAuthorId();
		
	}
	@PutMapping("/authors")
	private Author update(@RequestBody Author author) {
		authorService.saveOrUpdate(author);
		return author;
	}
}
