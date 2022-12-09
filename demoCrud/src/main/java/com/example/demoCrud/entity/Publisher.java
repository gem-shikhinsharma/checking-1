package com.example.demoCrud.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "publishers")
public class Publisher {
	
	@Id
	@Column
	private int publisherId;
	
	@Column
	private String publisherName;
	
	@Column
	private String publisherNationality;
	
	@OneToMany(mappedBy = "publisherId", cascade =  CascadeType.ALL)
	private List<Book> books = new ArrayList<>();
	

	public int getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public String getPublisherNationality() {
		return publisherNationality;
	}
	public void setPublisherNationality(String publisherNationality) {
		this.publisherNationality = publisherNationality;
	}
	
	
}
