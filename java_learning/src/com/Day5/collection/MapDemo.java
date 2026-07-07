package com.Day5.collection;

import java.util.HashMap;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapDemo {
	public static void main(String []args) {
		HashMap<String, String> hst = new HashMap<String,String>();
		
		hst.put("scott", "tiger");
		hst.put("jack", "jill");
		hst.put("polo", "lili");
		hst.put("jack", "rose");
		
		System.out.println("Using Manually Keys");
		System.out.println("Scott: "+hst.get("scott"));
		System.out.println("Polo: "+hst.get("polo"));
		System.out.println("Jack: "+hst.get("jack"));
		
		//Printing ALL keys and Values
		System.out.println("\nUsing All Keys and Values");
		for(String e: hst.keySet())
			System.out.println(e+ " : "+ hst.get(e));
		
		
		//Using Lambda Function
		System.out.println("\nUsing Lambda Function");
		hst.forEach((key,value) -> System.out.println(key+" : "+value));
	}
}
