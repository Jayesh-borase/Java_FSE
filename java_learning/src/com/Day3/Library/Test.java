package com.Day3.Library;

public class Test {

	public static void main(String[] args) {

		Member varun = new Member("Varun");
		
		Book python = new Book("Python");
		Book java = new Book("Java");
		
		try {
			python.issueBook(varun);
			java.issueBook(varun);
		} catch (BookException e) {
			e.printStackTrace();
		}
		
	}

}
