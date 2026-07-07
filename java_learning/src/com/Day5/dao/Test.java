package com.Day5.dao;

import com.Day5.pojo.Book;

public class Test {
	public static void main(String []args) {
		BookDaoCollectionImpl bk = new BookDaoCollectionImpl();
		Book b1 = new Book(01,"C Programming", "Yashwant Kanetkar",130);
		Book b2 = new Book(02,"C++ Programming", "Yashwant Kanetkar",200);
		Book b3 = new Book(03,"Java Programming", "Hilbert",540);
		Book b4 = new Book(04,"Computer Networks", "Larry Peterson",400);
		Book b5 = new Book(05,"Operating Systems", "Hilberk Schelchutz",450);
		
		bk.save(b1);
		bk.save(b2);
		bk.save(b3);
		bk.save(b4);
		bk.save(b5);
		
		
		
	}
}
