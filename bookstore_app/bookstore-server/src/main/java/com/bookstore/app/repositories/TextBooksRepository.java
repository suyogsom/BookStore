package com.bookstore.app.repositories;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.bookstore.app.models.TextBooks;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

@Component
public class TextBooksRepository{ // implements CrudRepository<TextBooks, String>{ 	
	
	private List<TextBooks> dataStore = new ArrayList<>(); 
	
	@PostConstruct
	public void init() throws IOException {
		 
		ObjectMapper objMapper = new ObjectMapper();
		TypeFactory typeFactory = objMapper.getTypeFactory();
		 
		List<TextBooks> textBooks = objMapper.readValue(new File("/Users/suyogsomavanshi/git/BookStore/bookstore_app/bookstore-server/src/resources/Json/TextBooks.json"), typeFactory.constructCollectionType(List.class, TextBooks.class));
		  
		dataStore = textBooks;
	 }

	public List<TextBooks> getAllTextBooks() {
		return dataStore;
	}

	public TextBooks findById(String id) {
		return dataStore.get(setIndex(id));
	}
	
	public void addTextbook(TextBooks textBook) {
		dataStore.add(textBook);		
	}

	public void updateTextbook(TextBooks textBook, String id) {
		dataStore.set(setIndex(id), textBook);		
	}

	public void deleteById(String id) {
		dataStore.remove(setIndex(id));
	}

	public int setIndex(String id) {
		int index = 0;
		for(int i=0;i<dataStore.size();i++) {
			if(id.equals(dataStore.get(i).getId())) {
				index = i;
			}
		}		
		return index;
	}
		
//	//loading the data
//	 
//	public void init() {
//		//read json
//		//map the json to TextBook model using jackson
//		//load json data to text book objects
//		//store the objects in datastore
//	}

}


