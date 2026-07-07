package com.Day3;

interface Greeting{
	public void sayHello();
}

public class GreetingDemo {

	class GreetingInner implements Greeting{			//Inner class 
		@Override
		public void sayHello() {
			System.out.println("Greeting from inner class");
		}
	}
	
	public void anotherDemo() {
		
		class GreetingInnerMethod implements Greeting{			//class inside a method

			@Override
			public void sayHello() {
				System.out.println("Greeting from a class inside a method which is inside a class");
				
			}
						
		}
		new GreetingInnerMethod().sayHello();
		
	}
	
	
	public static void main(String[] args) {
		GreetingDemo demo = new GreetingDemo();
		Greeting g1 = demo.new GreetingInner();
		
		g1.sayHello();
		demo.anotherDemo();
		
		Greeting g = new Greeting() {
			
			@Override
			public void sayHello() {
				System.out.println("Greeting from anonymous inner class");
			}
		};
		
		g.sayHello();
		
		Greeting greet = () -> System.out.println("Greeting from lambda");
		greet.sayHello();
	}
	
}
