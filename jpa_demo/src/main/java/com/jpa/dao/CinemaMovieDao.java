package com.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpa.entity.Cinema;
import com.jpa.entity.Movie;

public class CinemaMovieDao 
{
	private static EntityManagerFactory emf;
	
	public CinemaMovieDao() {
		emf=Persistence.createEntityManagerFactory("MyJpa");
	}
	
	public Object save(Object obj)
	{
		EntityManager mgr=emf.createEntityManager();
		EntityTransaction txn=mgr.getTransaction();
		
		txn.begin();
		mgr.persist(obj);
		txn.commit();
		
		return obj;
		
	}
	
	public boolean addMovieToCinema(int mid,int cid)
	{
		EntityManager mgr=emf.createEntityManager();
		EntityTransaction txn=mgr.getTransaction();
		
		txn.begin();
		
		Movie m=mgr.find(Movie.class,mid);
		Cinema c=mgr.find(Cinema.class,cid);
		
		c.getMovies().add(m);
		txn.commit();
		
		return true;	
	}
	
	public List<Cinema> findByMovieTitle(String title)
	{
		String hql="select c from Cinema c JOIN c.movies m where m.title=:title";
		EntityManager mgr = emf.createEntityManager();
		
		Query query=mgr.createQuery(hql);
		query.setParameter("title", title);
		
		return query.getResultList();
	}
	
	public List<Movie> findByGenre(String genre)
	{
		String hql="From Movie where genre=:genre";
		EntityManager mgr = emf.createEntityManager();
		
		Query query=mgr.createQuery(hql);
		query.setParameter("genre", genre);
		
		return query.getResultList();
	}
	
	public List<Cinema> findByCity(String location)
	{
		String hql="From Cinema where location=:location";
		EntityManager mgr = emf.createEntityManager();
		
		Query query=mgr.createQuery(hql);
		query.setParameter("location", location);
		
		return query.getResultList();
	}
	
	public List<Movie> findMovieByCity(String location)
	{
		String hql="Select m from Movie m JOIN m.cinemas c where c.location=:location";
		EntityManager mgr = emf.createEntityManager();
		
		Query query=mgr.createQuery(hql);
		query.setParameter("location", location);
		
		return query.getResultList();
	}
	
}
