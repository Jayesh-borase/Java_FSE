package com.jpa.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jpa.dao.SongMovDao;
import com.jpa.entity.Movie;
import com.jpa.entity.Song;

public class TestSongMovDao 
{
	public static SongMovDao dao;
	
	@BeforeAll
	public static void init()
	{
		dao=new SongMovDao();
	}
	
	@Test
	public void testSaveSong()
	{
		Song s = new Song("End Of Begining", "Joe Kerry");
		assertNotNull(dao.save(s));
	}
	
	@Test
	public void testAddSongToMovie()
	{
		assertNotNull(dao.addSongToMovie(3,112));
	}
	
	@Test
	public void testFindSongsByMovie()
	{
		List<Song> songs=dao.findSongsByMovie("Titanic");
		
		assertNotNull(songs);
		songs.forEach(System.out::println);
		
	}
	
	@Test
	public void testFindMovieBySong()
	{
		List<Movie> movies=dao.findMovieBySong("Kesariya");	
		
		assertNotNull(movies);
		movies.forEach(System.out::println);
	}
}
