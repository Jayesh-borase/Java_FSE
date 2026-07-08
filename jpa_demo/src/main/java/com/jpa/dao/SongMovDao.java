package com.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpa.entity.Movie;
import com.jpa.entity.Song;

public class SongMovDao 
{
	private static EntityManagerFactory emf;
	
	public SongMovDao()
	{
		emf=Persistence.createEntityManagerFactory("MyJpa");
	}
	
	public Object save(Object obj) {

        EntityManager mgr = emf.createEntityManager();
        EntityTransaction txn = mgr.getTransaction();

        txn.begin();
        mgr.persist(obj);
        txn.commit();

        return obj;
    }

    public boolean addSongToMovie(int sid, int mid) {

        EntityManager mgr = emf.createEntityManager();
        EntityTransaction txn = mgr.getTransaction();

        txn.begin();

        Song song = mgr.find(Song.class, sid);
        Movie movie = mgr.find(Movie.class, mid);

        song.setMovie(movie);
        movie.getSongs().add(song);

        txn.commit();

        return true;
    }
    
    public List<Song> findSongsByMovie(String title) {

        String hql = "Select s from Song s where s.movie.title=:title";

        EntityManager mgr = emf.createEntityManager();

        Query query = mgr.createQuery(hql);
        query.setParameter("title", title);

        return query.getResultList();
    }
    
    public List<Movie> findMovieBySong(String songName)
    {
        String hql = "Select m from Movie m JOIN m.songs s where s.s_name=:songName";

        EntityManager mgr = emf.createEntityManager();

        Query query = mgr.createQuery(hql);
        query.setParameter("songName", songName);

        return query.getResultList();
    }
}
