package com.Day3;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionInterfacesDemo {

	public static void print(Object obj) {
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		
		Consumer<String> c = (s) -> System.out.println(s);
		c.accept("Adios");
		
		Consumer<String> c1 = System.out::println;
		c1.accept("Hello");
		c1.accept("Hi");
		c1.accept("Bye");
		
		Consumer<String> c2 = FunctionInterfacesDemo::print;
		c2.accept("Alpha");
		
		BiConsumer<String,Integer> c3 = (name,age) -> System.out.println(name+" "+age);
		c3.accept("Varun", 21);
		
		Supplier<String> s1 = () -> "Varun";
		System.out.println(s1.get());
		print(s1.get());
		
		Supplier<Double> random = () -> Math.random();
		System.out.println(random.get());
		
		Predicate<Integer> nonNegative = (x) -> x >= 0;
		System.out.println(nonNegative.test(3));
		
		Predicate<Integer> isEven = (x) -> x % 2 == 0;
		System.out.println(isEven.test(5));
		
		BiPredicate<String,String> equals = (str,con) -> str.equals(con);
		System.out.println(equals.test("Varun", "Varun"));
		
		Function<Integer,Integer> square = (x) -> x * x;
		System.out.println(square.apply(5));
		
		BiFunction<Integer,Integer,Integer> greater = (a,b) -> a > b ? a : b;
		System.out.println(greater.apply(5, 10));
		
		BiFunction<Integer,Integer,Integer> sum = (n1,n2) -> n1 + n2;
		System.out.println(sum.apply(5, 10));
	}
}
