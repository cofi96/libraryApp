package com.LibraryApp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String bookName;
	private String autor;
	private double price;
	
	
	public Book() {}
	
	public Book(String bookName, String autor, double price) {
		super();
		this.bookName = bookName;
		this.autor = autor;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public String getBookName() {
		return bookName;
	}
	public String getautor() {
		return autor;
	}
	public double getPrice() {
		return price;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setautor(String autor) {
		this.autor = autor;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
