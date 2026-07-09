package com.sample;

interface Currency 
{
	double dollarValue();
	
	static double convert(Currency src,Currency tar,double amt)
	{
		return tar.dollarValue() / src.dollarValue() * amt;
	}
	
	Currency USD=() -> 1.0;
	Currency INR=() -> 95.50;
	
}


class CurrencyConverer
{
	public static void main(String[] args) 
	{
		System.out.println(Currency.convert(Currency.USD,Currency.INR,10));
	}
}
