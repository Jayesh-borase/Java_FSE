package com.jpa.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpa.entity.Customer;
import com.jpa.entity.Order;

public class OrderDao 
{
	private EntityManagerFactory emf;
	
	public OrderDao()
	{
		emf=Persistence.createEntityManagerFactory("MyJpa");
	}
	
	
	public Order placeOrder(Order o,int cid)
	{
		EntityManager mgr=emf.createEntityManager();
		EntityTransaction txn=mgr.getTransaction();
		
		txn.begin();
		mgr.persist(o);
		
		Customer c=mgr.find(Customer.class, cid);
		o.setCust(c);
		txn.commit();
		
		return o;
	}
	
	public List<Order> findByCustomer(int cid)
	{
//		String hql="";
//		
//		EntityManager mgr=emf.createEntityManager();
//		Query query=mgr.createQuery(hql);
//		query.setParameter("cid", cid);
//		
//		return query.getResultList();
		
		EntityManager mgr=emf.createEntityManager();
		
		Customer c=mgr.find(Customer.class, cid);
		return c.getOrders();
	}
	
	
	public List<Order> findByDateRange(LocalDate start,LocalDate end)
	{
		String hql="from Order where orderDate BETWEEN :start and :end";
		
		EntityManager mgr=emf.createEntityManager();
		Query query=mgr.createQuery(hql);
		
		query.setParameter("start", start);
		query.setParameter("end", end);
		
		return query.getResultList();
	}
}
