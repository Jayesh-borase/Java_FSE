package com.shoppingApp;

public final class CartFactory {

	private CartFactory() {}
	
	public static ShoppingCart getCart() {
		return new ShoppingCart();
	}
}
