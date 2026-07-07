package com.Day5.collection;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateDemo {
	public static void main(String []args) {
		LocalDate d1 = LocalDate.now();
		System.out.println(d1);
		
		LocalDate d2 = LocalDate.of(2012, 8, 12);
		System.out.println(d2);
		
		LocalDate d3 = LocalDate.parse("2018-06-23");
		System.out.println(d3);
		
		System.out.println(d1.plusDays(2));
		System.out.println(d1.minus(1,ChronoUnit.MONTHS));
		System.out.println(d2.getDayOfWeek());
		System.out.println(d2.getDayOfMonth());
		System.out.println(d2.isLeapYear());
		
		
		//Calculate age based on DOB
		
		LocalDate d4 = LocalDate.of(2005, 8, 3);
		
		System.out.println(ChronoUnit.YEARS.between(d4, d1));
		
		
	}
}
