package com.example.demoCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoCrud.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
