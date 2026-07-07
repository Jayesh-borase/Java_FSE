package com.Day4.stock;

public final class StockSingelton {
	
	private static Stock st;
	
	public static Stock getStock() {
		if(st == null) {			
			st = new Stock();
		}
		return st;
	}
	
}
