package com.bookstore.app.test;

import java.io.IOException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.bookstore.app.repositories.TextBooksRepository;

public class RepoTest {
	
	@Test
	@Disabled
	public void testRepo() throws IOException, IOException {
		
		TextBooksRepository bookRepo = new TextBooksRepository();
		System.out.print(bookRepo);	
	}

}
