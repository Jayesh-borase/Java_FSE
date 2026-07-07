package com.Day3.Library;

public class Book {
	private String title;
	private Member mb;
	
	public Book(String title) {
		this.title = title;
	}
		
	public void status() {
		if(mb == null) {
			System.out.println(title+" Book is not issued to anoyone yet.");
		}
		else {
			System.out.println(title + " Book is already issued to " + mb);
		}
	}
	
	public void issueBook(Member mb) throws BookException {
		if(this.mb == null) {
			if(mb.borrowBook(this)) {
				this.mb = mb;
				System.out.println("Book issued!");
			}
			else {
				throw new BookException(mb + " has already borrowed a book!");
			}
		}
		else {
			throw new BookException(title + " is not available!");
		}
	}
	
	public void bookReturn(Member member) {
		if(this.mb == member) {			
			this.mb = null;
		}
		else {
			System.out.println(title + " is not borrowed yet to return.");
		}
	}

	@Override
	public String toString() {
		return title;
	}
	
}
