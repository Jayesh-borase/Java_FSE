package com.mmcoe.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;


public class TestAssertions 
{
	@Test
	public void testAssert()
	{
		String s1="Hello";
		String s2="Hello";
		
		assertEquals(s1,s2);
		//assertSame(s1,s2);
		//assertNotNull(s2);
//		  assertNull(s2);
	}
}
