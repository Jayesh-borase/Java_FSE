package com.shoppingApp;

public interface ShoopingInterface {
	
	public void addToCart(Product P) throws CartSizeException;
	public void checkout();
}
