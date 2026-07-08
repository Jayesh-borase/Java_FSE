package com.jpa.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jpa.dao.OrderDao;
import com.jpa.entity.Order;

public class testOrderDao 
{
	private static OrderDao dao;
	
	@BeforeAll
	public static void init()
	{
		dao=new OrderDao();
	}
	
	@Test
	public void testPlaceOrder()
	{
		Order c=new Order(LocalDate.of(2025, 6, 26),2000);
		assertNotNull(dao.placeOrder(c,1));
	}
	@Test 
	public void findByCustomer()
	{
		List<Order> orders=dao.findByCustomer(1);
		assertFalse(orders.isEmpty());
		orders.forEach(System.out::println);
	}
	
	@Test
	public void testFindByDaterange()
	{
		List<Order> orders=dao.findByDateRange(LocalDate.of(2025, 6, 1),LocalDate.of(2026, 6, 1));
		
		assertFalse(orders.isEmpty());
		
		orders.forEach(System.out::println);
	}
}
