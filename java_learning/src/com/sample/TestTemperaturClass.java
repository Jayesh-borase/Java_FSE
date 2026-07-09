package com.sample;


public class TestTemperaturClass 
{
	public static void main(String arg[])
	{
	TemperatureConverter convert=new TemperatureConverter();
	
	System.out.println(convert.cToF(20));
	System.out.println(convert.fToC(40));
}
}