package com.Day6.StreamsAPI;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstStreamDemo {
	public static void print(Object obj) {
		System.out.println(obj);
	}
	
	public static int add(int a,int b) {
		return a+b;
	}
	public static void main(String []args) {
//		Integer[] arr = {2,5,7,6,9,3,2,4};
//		List<Integer> lst = Arrays.asList(arr);
		
//		for(int n:lst) {
//			System.out.println(n);
//		}
	
//		Stream<Integer> str1 = lst.stream();
//		str1.forEach(System.out::println); // For each is a terminal operation
//		System.out.println(str1.count()); // count is a terminal operation
		
//		lst.stream().distinct().forEach(System.out::println); //distinct is intermediate
//		System.out.println(lst.stream().distinct().count()); //Count is terminal
//		System.out.println(lst.stream().filter(n->n>5).count()); //Filter is intermediate
		
//		lst.stream().distinct().sorted().forEach(System.out::println); //Sorted is intermediate
		
//		System.out.println(lst.stream().reduce(0,(n,m)-> n+m)); //reduce is terminal 
//		System.out.println(lst.stream().reduce(0, Integer::sum));
//		System.out.println(lst.stream().reduce(0,FirstStreamDemo::add));
		
//		lst.stream().limit(5).forEach(System.out::println);  // Limit the intermediate
		
		IntStream istr = IntStream.range(0,99);
//		System.out.println(istr.count());
//		System.out.println(istr.sum());
//		System.out.println(istr.skip(50).sum());
		
		IntStream istr2 = IntStream.of(5,7,6,9,3,2,4);
//		System.out.println(istr2.count());
//		System.out.println(istr2.sum());
		
//		IntSummaryStatistics statics = istr.summaryStatistics();
//		System.out.println(statics);
		
		
		
		
	}
	
}
