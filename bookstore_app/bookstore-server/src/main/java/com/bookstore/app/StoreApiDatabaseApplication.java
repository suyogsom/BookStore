package com.bookstore.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApiDatabaseApplication  {	
	
	public static void main(String[] args) { 
		SpringApplication.run(StoreApiDatabaseApplication.class, args); 
		System.out.println("Application Started");
	}
}
