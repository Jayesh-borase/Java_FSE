package com.Day5.dao;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Vector;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.Day5.pojo.Book;

public class BookDaoCollectionImpl implements BookDao {
	
	private Vector<Book> books;
	
	public BookDaoCollectionImpl() {
		Stream<String> lines = null;
		try {
			lines = Files.lines(Paths.get("src/com/Day5/dao/Books.txt"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		books = new Vector<Book>();
	}
	@Override
	public boolean save(Book b) {
		books.add(b);
		return true;
	}

	@Override
	public Optional<Book> find(int isbn) {

//		for(Book book: books) {
//			if(book.getIsbn() == isbn) {
//				return book;
//			}
//		}
		
		return books.stream()
					.filter(c -> c.getIsbn() == isbn)
					.findFirst();
		
	}

	@Override
	public List<Book> list() {
		return books.stream().collect(Collectors.toList());
	}

	@Override
	public boolean delete(int isbn) {
//		for(Book book: books) {
//			if(book.getIsbn() == isbn) {
//				books.remove(book);
//				return true;
//			}
//		}
//		return false;
		
		return books.removeIf(b->b.getIsbn()==isbn);
	}
	@Override
	public List<Book> findByPrice(double min, double max) {
		return books.stream()
								.filter(c-> c.getPrice()>=min && c.getPrice()>=max)
								.collect(Collectors.toList());		
		
	}
	
}
