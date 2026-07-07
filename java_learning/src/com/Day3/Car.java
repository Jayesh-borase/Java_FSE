package com.Day3;

public class Car {
	private String model;
	private String[] features;
	
	public Car(String model,String...features) {
		this.features = features;
		this.model = model;
	}
	
	public void specs(){
		System.out.println("Specs: ");
		for(String f : features){
			System.out.println(f);
		}
	}
	
	public static void main(String ar[]) {
		Car c = new Car("XUV700","ADAS","Cruze Control"); 
		c.specs();
	}
	
}


