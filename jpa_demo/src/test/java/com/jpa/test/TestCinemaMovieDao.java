package com.jpa.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jpa.dao.CinemaMovieDao;
import com.jpa.entity.Cinema;
import com.jpa.entity.Movie;
import com.jpa.entity.Player;

public class TestCinemaMovieDao
{
	public static CinemaMovieDao dao;
	
	@BeforeAll
	public static void setup()
	{
		dao=new CinemaMovieDao();
	}
	
	@Test
	public void testSaveMovie()
	{
		Movie m=new Movie(112,"Mission Impossible","spy");
		assertNotNull(dao.save(m));
	}
	
	@Test
	public void testSaveCinema()
	{
		Cinema c=new Cinema(30,"Citypride","Hydrabad");
		assertNotNull(dao.save(c));
	}
	@Test
	public void testAddMovieToCinema()
	{
		assertTrue(dao.addMovieToCinema(112, 10));
	}
	
	@Test
	public void testFindByMovieTitle()
	{
		List<Cinema> cinemas=dao.findByMovieTitle("Titanic");
		assertNotNull(cinemas);
		
		cinemas.forEach(System.out::println);
		
	}
	@Test
	public void findByMovieGenre()
	{
		List<Movie> movies=dao.findByGenre("Fiction");
		assertNotNull(movies);
		
		movies.forEach(System.out::println);
	}
	
	@Test
	public void findByCity()
	{
		List<Cinema> cinemas=dao.findByCity("Pune");
		assertNotNull(cinemas);
		
		cinemas.forEach(System.out::println);
	}
	
	@Test
	public void findMovieByCity()
	{
		List<Movie> movies=dao.findMovieByCity("Pue");
		assertNotNull(movies);
		
		movies.forEach(System.out::println);
	}
	
	
	
}
