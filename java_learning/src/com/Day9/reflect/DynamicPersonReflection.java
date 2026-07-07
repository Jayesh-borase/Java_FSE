package com.Day9.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class DynamicPersonReflection 
{
	public static void main(String[] args) throws Exception 
	{
		//Loads the class into memory
		Class pc=Class.forName("com.Day9.reflect.Person");
		
		Constructor cc = pc.getConstructor(String.class,int.class);
		System.out.println(cc);
		
		Object obj =cc.newInstance("Bob",33);
		System.out.println(obj);
		
		Method mp=pc.getDeclaredMethod("print", null);
		System.out.println(mp);
		
		mp.setAccessible(true);
		mp.invoke(obj, null);
	}
}
