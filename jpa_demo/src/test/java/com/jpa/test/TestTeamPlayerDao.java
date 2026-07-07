package com.jpa.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jpa.dao.TeamPlayerDao;
import com.jpa.entity.Player;
import com.jpa.entity.Team;

public class TestTeamPlayerDao 
{
	
	private static TeamPlayerDao dao;
	
	@BeforeAll
	public static void init()
	{
		dao=new TeamPlayerDao();
	}
	
	@Test
	public void testSaveTeam()
	{
		Team t=new Team("DC","Delhi Capital","Parth Jindal");
		
		assertNotNull(dao.saveTeam(t));
	}
	
	@Test
	public void testSaveDept()
	{
		Player p=new Player(1,"KL Rahul","Batsman",1800000);
		
		assertNotNull(dao.savePlayer(p,"DC"));
	}
	
	@Test
	public void testFindPlayer()
	{
		Player p= dao.findPlayer(18);
		assertNotNull(p);
		System.out.println(p);
		
		Team t=p.getTeam();
		System.out.println(t);
	}
	
	@Test
	public void testFindteam()
	{
		Team t= dao.findTeam("RCB");
		System.out.println(t);
		assertNotNull(t);
		
		Set<Player> emps=t.getPlayers();
		emps.forEach(System.out::println);
	}
	
	@Test
	public void testFindByRole()
	{
		List<Player> players=dao.findByRole("Batsman");
		assertNotNull(players);
		
		players.forEach(System.out::println);
		
	}
	
	@Test
	public void testFindByBidAmount()
	{
		List<Player> players=dao.findPlayerByBidAmount(1900000,2000000);
		assertNotNull(players);
		
		players.forEach(System.out::println);
		
	}
}
