package com.Day4.stock;

public class TestStock {

	public static void main(String[] args) {
		
		Holder h = StockSingelton.getStock();
		Broker b = StockSingelton.getStock();
		Exchange e = StockSingelton.getStock();
		
		System.out.println(h == b);
		System.out.println(b == e);
	}

}
