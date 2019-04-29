package com.bookstore.app.services;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.app.models.TextBooks;
import com.bookstore.app.repositories.TextBooksRepository;

@Service
public class TextBooksService {

	@Autowired
	private TextBooksRepository textBookRepository;

	public List<TextBooks> getAllTextbooks(){	
		List<TextBooks> textBooks = new ArrayList<>(); 
		System.out.println("textbook_info");
		textBooks.add(new TextBooks("1001","CIS","Java intro","this is java book","23134",223.4));
		textBooks.add(new TextBooks("1002","CIVIL","Structure design","this book gives basic foundation of structural design","34567",432.4));
		textBookRepository.findAll().forEach(textBooks::add);		
		return textBooks;		
	}

	public TextBooks getTextbook(String id){ 
		return textBookRepository.findById(id).get();  
	}

	public void addTextbook(TextBooks textBook){	
		textBookRepository.save( textBook);
	}

	public void updateTextbook(TextBooks textBook, String id) {	
		textBookRepository.save(textBook);	
	}

	public void deleteTextbook(String id){	
		textBookRepository.deleteById(id);	   
	}
}
