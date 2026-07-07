package com.Day5.service;

public class BookNotFoundException extends Exception {

	public BookNotFoundException() {
		
	}

	public BookNotFoundException(String message) {
		super(message);
	}
	
}
