package com.Day9.reflect;

import java.security.BasicPermission;

public class Person 
{
	private String name;
	private int age;
	
	static {
		//Executes at the time of class loading
		System.out.println("Person Class loaded..");
	}
	{
		System.out.println("Person Intitated");
	}
	public Person()
	{
	}
	
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	private void print()
	{
		SecurityManager mgr=new SecurityManager();
		mgr.checkPermission(new BasicPermission("Private Method") {
			
		});
		System.out.println("Name: "+name+", Age"+age);
	}
	
	@Override
	public String toString()
	{
		return "Person name : "+name+", Age"+age;
	}
	
}
