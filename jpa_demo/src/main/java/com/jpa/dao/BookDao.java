package com.jpa.dao;

import java.util.List;
import java.beans.Customizer;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpa.entity.Book;


public class BookDao 
{
	public static EntityManagerFactory emf;
	
	static {
		emf=Persistence.createEntityManagerFactory("MyJpa");
	}
	
	public Book save(Book c) {

		EntityManager mgr = emf.createEntityManager();
		EntityTransaction txn = mgr.getTransaction();

		try {
			txn.begin();
			mgr.persist(c);
			txn.commit();
			return c;
		} catch (Exception e) {
			e.printStackTrace();
			txn.rollback();
			return null;
		} finally {
			mgr.close();
		}
	}

	public Book find(int isbn) {

		EntityManager mgr = emf.createEntityManager();
		try {
			return mgr.find(Book.class, isbn);
		} finally {
			mgr.close();
		}
	}

	public List<Book> list() {

		EntityManager mgr = emf.createEntityManager();
		try {
			Query query = mgr.createQuery("FROM Book");
			return query.getResultList();
		} finally {
			mgr.close();
		}
	}

	public boolean delete(int isbn) {

		EntityManager mgr = emf.createEntityManager();
		EntityTransaction txn = mgr.getTransaction();
		try {
			txn.begin();
			Book c = mgr.find(Book.class, isbn);
			mgr.remove(c);
			txn.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			txn.rollback();
			return false;
		} finally {
			mgr.close();
		}
	}
}
	

