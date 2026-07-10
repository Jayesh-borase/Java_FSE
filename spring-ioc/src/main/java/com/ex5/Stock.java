package com.ex5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("skt")
@Scope("singleton")
public class Stock {
	
	public Stock()
	{
		System.out.println("Stock constructor");
	}
	
	private static Stock stk;
	
	//@Bean("stk")
	public static Stock getStock()
	{
		System.out.println("Stock Singelon");
		if(stk == null)
			stk=new Stock();
		
		return stk;
	}
	
}
