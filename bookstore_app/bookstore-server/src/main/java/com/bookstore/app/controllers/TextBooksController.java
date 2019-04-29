package com.bookstore.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.app.models.TextBooks;
import com.bookstore.app.services.TextBooksService;

@RestController
public class TextBooksController {
	
	@Autowired
	private TextBooksService textBooksService;
	
	@GetMapping("/books/textbooks")
	public List<TextBooks> getAllTextbooks(){	
		return textBooksService.getAllTextbooks(); 
	}
	

	@GetMapping("/books/textbooks/{textId}")  
	public TextBooks getTextbook(@PathVariable String textId)  {	
		return textBooksService.getTextbook(textId);	
	}

	@PostMapping(value="/books/textbooks/add") 
	public void addTextbook(@RequestBody TextBooks textbook)  {	
		textBooksService.addTextbook(textbook);   
	}

	@PostMapping(value="/books/textbooks/update/{id}") 
	public void updateTextbook(@RequestBody TextBooks textbook, @PathVariable String id)  {	
		textBooksService.updateTextbook(textbook, id);  
	}

	@PostMapping(value="/books/textbooks/delete/{id}") 
	public void deleteTextbook( @PathVariable String id)  {   
		textBooksService.deleteTextbook(id);	
	}
					
				
}
