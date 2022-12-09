package com.example.demoCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoCrud.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

	void save(java.awt.print.Book book);

}
