package com.LibraryApp.databaseSeeder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.LibraryApp.models.Book;
import com.LibraryApp.repository.BookRepository;

@Component
public class DatabaseSeeder implements CommandLineRunner {
	
	private BookRepository bookRepository;
	
	@Autowired
	public DatabaseSeeder(BookRepository bookRepository) {
		this.bookRepository=bookRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		List<Book> books = new ArrayList<>();
		
		books.add(new Book("Alhemicar","Paulo Koeljo",135));
		books.add(new Book("Alef","Paulo Koeljo",95));
		books.add(new Book("Ubistvo u orijent ekspresu","Agata Kristi",125.25));
		books.add(new Book("Smrt na nilu","Agata Kristi",175.56));
		
		bookRepository.saveAll(books);
	}

}
