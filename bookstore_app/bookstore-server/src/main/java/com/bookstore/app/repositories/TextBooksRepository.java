package com.bookstore.app.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.app.models.TextBooks;

public interface TextBooksRepository extends CrudRepository<TextBooks, String>{ 
	
//	private List<TextBooks> datastore;
//	
//	//loading the data
//	@PostConstruct() {
//		//read json
//		//map the json to TextBook model using jackson
//		//load json data to text book objects
//		//store the objects in datastore
//	}
//	
//	public TextBook getTextBook(String id) {
//		datastore.
//	}
	
	
}


