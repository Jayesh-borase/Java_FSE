package com.Day5.collection;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeDemo {
	public static void main(String []args) {
		LocalTime t1 = LocalTime.now();
		System.out.println(t1);

		LocalTime t2 = LocalTime.of(06,23);
		System.out.println(t2);
		
		LocalTime t3 = LocalTime.parse("09:25");
		System.out.println(t3);
		
		System.out.println(t2.plus(1,ChronoUnit.HOURS));
		System.out.println(t2.getHour());
		System.out.println(LocalTime.MAX);
	}
}
