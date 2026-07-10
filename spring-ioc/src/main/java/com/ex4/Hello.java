package com.ex4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hi")
public class Hello {
	
	private String message;
	
	public Hello()
	{
		System.out.println("Default Constructor");
	}

	
	public Hello(String message) {
		this.message = message;
		System.out.println("Parameterized Constructor");
	}

	public String getMessage() {
		return message;
	}

	@Value("Bonjour Spring")
	public void setMessage(String message) {
		this.message = message;
		System.out.println("Setter Method");
	}
		
}
