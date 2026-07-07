package com.Day9.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonReflection {
	public static void main(String[] args) throws Exception {
		Person p1=new Person("POLO",21);
		
		System.out.println(p1);
		//p1.print();
		
		Class pc=p1.getClass();
		System.out.println(pc.getName());
		System.out.println(pc.getSuperclass());
		
		Constructor[] constructors=pc.getConstructors();
		System.out.println("--- List Of Constructors");
		
		for(Constructor c : constructors)
		{
			System.out.println(c);
		}
		System.out.println();
		Method[] methods=pc.getMethods();
		System.out.println("--- List of Methods");
		
		for (Method m : methods)
		{
			System.out.println(m);
		}
		
		System.out.println();
		Method[] declMethods=pc.getDeclaredMethods();
		System.out.println("--- List of Methods");
		
		for (Method m : declMethods)
		{
			System.out.println(m);
		}
		System.out.println();
		
		Field[] fields=pc.getDeclaredFields();
		
System.out.println("--- List of Fields");
		
		for (Field f : fields)
		{
			System.out.println(f);
		}
		
		
		
	}
}
