package com.example.demoCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoCrud.entity.Author;
import com.example.demoCrud.repository.AuthorRepository;

@Service
public class AuthorService {
	
	@Autowired
	AuthorRepository authorRepository;
	public List<Author> getAllAuthor() {
		List<Author> author= new ArrayList<Author>();
		authorRepository.findAll().forEach(author1 -> author.add(author1));
		return author;
	}

	public Author getAuthorById(int id) {
		return authorRepository.findById(id).get();
	}

	public void delete(int id) {
		authorRepository.deleteById(id);
		
	}

	public void saveOrUpdate(Author author) {
		authorRepository.save(author);
		
	}
	public void update(Author author, int authorId) {
		authorRepository.save(author);
	}

}
