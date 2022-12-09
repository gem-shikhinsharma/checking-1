package com.example.demoCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoCrud.entity.Publisher;
import com.example.demoCrud.repository.PublisherRepository;

@Service
public class PublisherService {

	@Autowired
	PublisherRepository publisherRepository;
	public List<Publisher> getAllPublisher() {

		List<Publisher> publisher = new ArrayList<Publisher>();
        publisherRepository.findAll().forEach(publisher1 -> publisher.add(publisher1));
        return publisher;

	}

	public Publisher getPublisherById(int id) {
		return publisherRepository.findById(id).get();
	}

	public void delete(int id) {
		publisherRepository.deleteById(id);
		
	}
	 public void saveOrUpdate(Publisher publisher){
	        publisherRepository.save(publisher);
	}
	 public void update(Publisher publisher, int publisherId){
	        publisherRepository.save(publisher);

    }

}