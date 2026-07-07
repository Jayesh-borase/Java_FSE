package com.Day6.StreamsAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class ParallelStreamDemo {
	public static void process(int i) {
		try {
			Thread.sleep(1);
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}
	public static void main(String[] args) {
		List<Integer> numbers = IntStream.range(0, 99).boxed().collect(Collectors.toList());
		
		long startTime = System.currentTimeMillis();
		numbers.stream().forEach(ParallelStreamDemo::process);
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken by Sequential Stream: "+(endTime-startTime));
		
		startTime = System.currentTimeMillis();
		numbers.parallelStream().forEach(ParallelStreamDemo::process);
		endTime = System.currentTimeMillis();
		System.out.println("Time taken by Parallel Stream: "+(endTime-startTime));
		
	}
}
