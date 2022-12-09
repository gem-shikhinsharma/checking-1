package com.example.demoCrud.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.example.demoCrud.entity.Publisher;

@Repository
public interface PublisherRepository extends JpaRepositoryImplementation<Publisher, Integer> {

}
