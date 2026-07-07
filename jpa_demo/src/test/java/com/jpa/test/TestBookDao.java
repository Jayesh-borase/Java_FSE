package com.jpa.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jpa.dao.BookDao;
import com.jpa.entity.Book;


public class TestBookDao 
{
	private static BookDao dao;
	
	@BeforeAll
	public static void init()
	{
		dao=new BookDao();
	}
	
	@Test
	public void testSave()
	{
		Book c=new Book(2,"C# Programming","Jim Cristen",350);
		
		assertNotNull(dao.save(c));
	}
	
	@Test
	public void testFind()
	{
		Book c= dao.find(1);
		System.out.println(c);
		assertNotNull(c);
	}
	
	@Test
	public void testList()
	{
		List<Book> books=dao.list();
		assertFalse(books.isEmpty());
		books.forEach(System.out::println);
	}
	
	@Test
	public void testDelete()
	{
		assertTrue(dao.delete(3));
	}
	
	
	
}
