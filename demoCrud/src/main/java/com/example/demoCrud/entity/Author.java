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
@Table(name ="authors")
public class Author {
	
	@Id
	@Column
	private int authorId;
	@Column
	private String authorName;
	@Column
	private String authorNationality;
	
	@OneToMany(mappedBy = "authorId" ,cascade = CascadeType.ALL)
	private List<Book> books = new ArrayList<>();
	

	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAuthorNationality() {
		return authorNationality;
	}
	public void setAuthorNationality(String authorNationality) {
		this.authorNationality = authorNationality;
	}


}
