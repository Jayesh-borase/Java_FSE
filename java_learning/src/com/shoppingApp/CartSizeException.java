package com.shoppingApp;

public class CartSizeException extends Exception {

	private static final long serialVersionUID = 1L;

	public CartSizeException() {
		super();
	}

	public CartSizeException(String message) {
		super(message);
	}
	
}
