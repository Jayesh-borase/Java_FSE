package com.Day6.StreamsAPI;

import java.util.*;
import java.util.stream.Collectors;

public class MapStreamDemo {
	public static void main(String[] args) {
//		Map<String,String> people = new HashMap<>();
//		people.put("Polo", "Pune");
//		people.put("Mili", "Mumbai");
//		people.put("Deny", "Delhi");
//		people.values().stream().forEach(System.out::println);	
//		List<String> cities = people.values().stream().map(c -> c.toUpperCase()).sorted().collect(Collectors.toList());
//		cities.forEach(System.out::println);
		
		Map<String,List<String>> contacts = new HashMap<>();
		contacts.put("Frudo", Arrays.asList("1212-3434","5656-7878"));
		contacts.put("Sean", Arrays.asList("2232-5434","5654-7654","1826-8765"));
		contacts.put("Ben", Arrays.asList("4565-6524","6767-8756","7878-3423"));
		
//		contacts.values()
//				.stream()
//				.flatMap(Collection::stream)
//				.forEach(System.out::println);
		
		//Printing all the numbers containing 8
		
//		contacts.values()
//				.stream()
//				.flatMap(Collection::stream)
//				.filter(c-> c.contains("8"))
//				.forEach(System.out::println);
		
		//Printing all numbers with removing "-" 
		contacts.values()
				.stream()
				.flatMap(Collection::stream)
				.map(c -> c.replace("-",""))
				.forEach(System.out::println);
	}
	
}
