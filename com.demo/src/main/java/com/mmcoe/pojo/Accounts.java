package com.mmcoe.pojo;

public class Accounts
{
	private double balance;
	
	public Accounts(Double balance)
	{
		this.balance=balance;
	}
	
	public double getBalance()
	{
		return this.balance;
	}
	
	public double deposit(double amount)
	{
		if(amount < 0)
		{
			throw new IllegalArgumentException("Amount should be positive");
		}
		
		balance=balance+amount;
		
		return balance;
	}
	
	public double withdraw(double amount)
	{
		if(amount < 0)
		{
			throw new IllegalArgumentException("Amount should be positive");
		}
		if(balance < amount)
		{
			throw new IllegalAmountException("Insufficient Funds");
		}
		
		balance=balance-amount;
		
		return balance;
	}
}
