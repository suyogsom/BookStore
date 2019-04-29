package com.bookstore.app.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.app.models.TextBooks;

public interface TextBooksRepository extends CrudRepository<TextBooks, String>{ 
	
}


