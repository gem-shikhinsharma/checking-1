package com.example.demoCrud.entity;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookISIN;
	@Column
	private String bookTitle;
	@Column
	private Date publishDate;
	@ManyToOne(cascade=CascadeType.ALL)
	Publisher publisherId;
	@ManyToOne(cascade=CascadeType.ALL)
	Author authorId;
	

	public int getBookISIN() {
		return bookISIN;
	}
	public void setBookISIN(int bookISIN) {
		this.bookISIN = bookISIN;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	

}
