package com.Day3.Library;

public class Member {
	
	private String name;
	private Book bk;
	
	public Member(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}

	public boolean borrowBook(Book bk) {
		if(this.bk == null) {
			this.bk = bk;
			return true;
		}
			return false;
	}
	
	public void returnBook() {
		if(this.bk == null) {
			System.out.println("No book borrowed to return.");
		}
		else {
			System.out.println(this.bk + " Returned!");
			this.bk.bookReturn(this);
			this.bk = null;
			
			
		}
	}
	
	public void Status() {
		if(bk == null) {
			System.out.println(name+" has not borrowed any book yet.");
		}
		else {
			System.out.println(name + " has borrowed a book " + bk);
		}
	}
	
}
