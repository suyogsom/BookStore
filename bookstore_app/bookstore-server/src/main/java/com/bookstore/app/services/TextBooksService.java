package com.bookstore.app.services;

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
		return textBookRepository.getAllTextBooks();		
	}

	public TextBooks getTextbook(String id){ 
		return textBookRepository.findById(id);  
	}

	public void addTextbook(TextBooks textBook){	
		textBookRepository.addTextbook( textBook);
	}

	public void updateTextbook(TextBooks textBook, String id) {	
		textBookRepository.updateTextbook(textBook,id);	
	}

	public void deleteTextbook(String id){	
		textBookRepository.deleteById(id);	   
	}
}
