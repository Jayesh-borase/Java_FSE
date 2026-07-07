package com.shoppingApp;

public class Test {

	public static void main(String[] args) {
		
		ShoopingInterface s = CartFactory.getCart();
		
		try {
			
			s.addToCart(new Product("Facewash",150));
			s.addToCart(new Product("HandWash",100));
			s.addToCart(new Product("Facewash",150));
			s.addToCart(new Product("HandWash",100));
			s.addToCart(new Product("Facewash",150));
			
		} catch (CartSizeException e) {
			System.out.println(e.getMessage());
		}
		
		s.checkout();
	}
	
}
