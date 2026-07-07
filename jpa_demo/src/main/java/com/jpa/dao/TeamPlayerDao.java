package com.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpa.entity.Player;
import com.jpa.entity.Team;


public class TeamPlayerDao 
{
private static EntityManagerFactory emf;
	
	static {
		emf=Persistence.createEntityManagerFactory("MyJpa");
	}
	
	public Team saveTeam(Team t)
	{
		EntityManager mgr=emf.createEntityManager();
		EntityTransaction txn=mgr.getTransaction();
		
		txn.begin();
		mgr.persist(t);
		txn.commit();
		
		return t;
		
	}
	
	public Player savePlayer(Player p,String code)
	{
		EntityManager mgr=emf.createEntityManager();
		EntityTransaction txn=mgr.getTransaction();
		
		txn.begin();
		
		Team t=mgr.find(Team.class,code);
		
		p.setTeam(t);
		mgr.persist(p);
		txn.commit();
		
		return p;
		
	}
	
	public Player findPlayer(int jno) {

		EntityManager mgr = emf.createEntityManager();
		try {
			return mgr.find(Player.class, jno);
		} finally {
			mgr.close();
		}
	}
	
	public Team findTeam(String code) {

	    EntityManager mgr = emf.createEntityManager();
	    try {
	        Team t = mgr.find(Team.class, code);

	        t.getPlayers().size();   // Load employees while session is open

	        return t;
	    } finally {
	        mgr.close();
	    }
	}
	
	public List<Player> findByRole(String role)
	{
		String hql="From Player where role=:role";
		EntityManager mgr = emf.createEntityManager();
		
		Query query=mgr.createQuery(hql);
		query.setParameter("role", role);
		
		return query.getResultList();
	}
	
	public List<Player> findPlayerByBidAmount(double min,double max)
	{
		String hql="From Player where bid_amt between :min and :max";
		EntityManager mgr = emf.createEntityManager();
		
		Query query=mgr.createQuery(hql);
		
		query.setParameter("min", min);
		query.setParameter("max", max);
		
		
		return query.getResultList();
	}
	
}
