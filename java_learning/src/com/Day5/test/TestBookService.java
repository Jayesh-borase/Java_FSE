package com.Day5.test;

import com.Day5.dao.BookDao;
import com.Day5.dao.BookDaoCollectionImpl;
import com.Day5.pojo.Book;
import com.Day5.service.BookNotFoundException;
import com.Day5.service.BookService;
import com.Day5.service.BookServiceImpl;
import java.util.List;

public class TestBookService {
	public static void main(String []args) {
		BookDao dao = new BookDaoCollectionImpl();
		BookService service = new BookServiceImpl(dao);
		
		service.save(new Book(01,"C Programming", "Yashwant Kanetkar",130));
		service.save(new Book(02,"C++ Programming", "Yashwant Kanetkar",200));
		service.save(new Book(03,"Java Programming", "Hilbert",340));
		service.save(new Book(04,"Computer Networks", "Larry Peterson",400));
		service.save(new Book(05,"Operating Systems", "Hilberk Schelchutz",450));
		
		System.out.println("Printing in Sorted Order");
		service.listOrderByTitle().forEach(System.out::println);
		
		System.out.println("All Books");
		for(Book b: service.list()) {
			System.out.println(b);
		}
		System.out.println("Book with isbn 02");
		try {
			System.out.println(service.find(02));
			
		}catch(BookNotFoundException ex) {
			ex.printStackTrace();
		}
		
		System.out.println("Books with price range from 300 to 400");
		for(Book b: service.findByPrice(300, 400))
			System.out.println(b);
		
		System.out.println("Deleting Book of isbn 02");
		try {
			service.delete(02);
		}catch(BookNotFoundException ex) {
			ex.printStackTrace();
		}
		
		
	}
}

//Comparator, Stream API(Lambda) 
