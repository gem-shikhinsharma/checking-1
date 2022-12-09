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

import com.example.demoCrud.entity.Publisher;
import com.example.demoCrud.service.PublisherService;

@RestController
public class PublisherController {
	@Autowired
	PublisherService publisherService;
	
	@GetMapping("/publisher")
	private List<Publisher> getAllPublisher(){
		return publisherService.getAllPublisher();
	}
    @GetMapping("/publisher/{publisherId}")
    private Publisher getPublisher(@PathVariable("publisherId")int publisherId)
    {
        return publisherService.getPublisherById(publisherId);
    }
	@DeleteMapping("/publisher/{publisherId}")
	private void deletePublisher(@PathVariable("publisherId") int publisherId){
        publisherService.delete(publisherId);
    }
	@PostMapping("/publishers")
    private int savePublisher(@RequestBody Publisher publisher){
        publisherService.saveOrUpdate(publisher);
        return publisher.getPublisherId();
    }
    @PutMapping("/publishers")
    private Publisher update(@RequestBody Publisher publisher){
        publisherService.saveOrUpdate(publisher);
        return publisher;
    }
	

}
