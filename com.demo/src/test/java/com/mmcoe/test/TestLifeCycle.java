package com.mmcoe.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestLifeCycle
{
	
	static {
		Configurator.setRootLevel(Level.INFO);
	}
	
	private static final Logger logger=LogManager.getLogger(TestLifeCycle.class);
	
	private List<String> items=new ArrayList<>();
	
	@BeforeAll
	public static void beforeAll()
	{
		logger.info("Executes Before all the test cases");
		//System.out.println("Executes Before all the test cases");
	}
	@AfterAll
	public static void afterAll()
	{
		System.out.println("Executes After all the test cases");
	}
	@BeforeEach
	public void init()
	{
		items=new ArrayList<String>();
		//items.add("whatever");
				
		System.out.println("Executes Before each test cases");
	}
	
	@AfterEach
	public void clean()
	{
		items=null;
		System.out.println("Executes After each test cases");
	}
	
	@Test
	public void testEmptyList() {
		assertTrue(items.isEmpty());
	}
	
	@Test
	public void testOneItem()
	{
		items.add("One");
		assertEquals(1,items.size());
	}
}
