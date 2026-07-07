package com.Day3;

public class StringDemo {
	
	public static void main(String ar[]) {
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s4 = new String("Hello");
		String s3 = "Hello";
		
		System.out.println(s2 == s4); 		// == compares references
		System.out.println(s1.equals(s3));	//compares values
		
		System.out.println(s1.hashCode());
		s1 = s1 + "World";
		System.out.println(s1.hashCode());
		
		String name = "Varun";
		String regex = "[A-Z]{1}[a-z]{3,}";
		System.out.println("Valid name : "+ name.matches(regex));		//matches method is used to validate string using regular expression
		
		String mob = "8530458123";
		String m_reg = "[6-9]{1}[0-9]{9}";
		System.out.println("Valid mobile number : "+ mob.matches(m_reg));
		
		String e_reg = "^[a-zA-z0-9]+@[a-zA-z]+\\.[a-z]{2,}";
		String email = "varuntipkari123@gmail.com";
		System.out.println("Valid Email : "+email.matches(e_reg));
		
	}
	
}
