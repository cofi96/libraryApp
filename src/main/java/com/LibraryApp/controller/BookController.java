package com.LibraryApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.LibraryApp.models.Book;
import com.LibraryApp.repository.BookRepository;

@RestController
@RequestMapping("/book")
public class BookController {
	
	BookRepository bookRepository;
	
	@Autowired
	public BookController(BookRepository bookrepository) {
		this.bookRepository=bookrepository;
	}
	
	@RequestMapping(value= "/create", method = RequestMethod.POST)
	public List<Book> createBook(@RequestBody Book book) {
		if(book.getBookName()!=null || book.getautor()!=null || book.getPrice()!= 0) {
		bookRepository.save(book);
		}
		return bookRepository.findAll();
	}
	
	@RequestMapping(value= "/delete/{id}", method = RequestMethod.POST)
	public List<Book> deleteBook(@PathVariable int id){
		
		bookRepository.deleteById(id);
		
		return bookRepository.findAll();
	}
	
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public List<Book> findAllBooks(){
		
		return bookRepository.findAll();
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public Book findById(@PathVariable int id) {
		
		
	return bookRepository.findById(id).get();
	}
	


}
