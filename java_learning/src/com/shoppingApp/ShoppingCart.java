package com.shoppingApp;
import com.Day4.datastructures.LinkedList;

public class ShoppingCart implements ShoopingInterface{

	private LinkedList<Product> items;
	private double total;
	
	public ShoppingCart() {
		items = new LinkedList<Product>();
		total = 0;
	}
	
	public void addToCart(Product p) throws CartSizeException{
		if(items.getSize() < 4) {
			
			this.items.addData(p);
			total += p.getPrice();
			System.out.println("Product added to cart");
			
		}
		else {
			
			throw new CartSizeException("Cart is full!");
			
		}
	}
	
	public void checkout() {
			System.out.println("=============================");
			System.out.println("Your cart detials ->");
			
			this.items.print();
			
			System.out.println("=============================");
			System.out.println("Total : "+this.total);
	}
	
}
