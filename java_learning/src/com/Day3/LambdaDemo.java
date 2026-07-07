package com.Day3;

// A interface having single abstract method is a functional interface
// and a lambda expression must be a functional interface

@FunctionalInterface
interface Hello{
	String greet();
	
	default void demo() {
		System.out.println("Hello Demo");
		temp();
	}
	
	static void test() {
		System.out.println("Hello test");
	}
	
	private void temp() {
		System.out.println("Hello Temp");
	}
}

@FunctionalInterface
interface Printer{
	void print(String name);
}

public class LambdaDemo {

	public static void main(String[] args) {
		Hello h = () -> "Hello Lambda exp";
		System.out.println(h.greet());
		
		Hello.test();
		h.demo();
		
		Hello h2 = () -> {
			String msg = "multiline lambda expression";
			return msg;
		};
		
		System.out.println(h2.greet());
		
		Printer p = (name) -> System.out.println(name);
		p.print("Varun");
		
		Printer p2 = System.out::println;		// :: operator is known as method reference
		p2.print("Good");
	}
	
}
