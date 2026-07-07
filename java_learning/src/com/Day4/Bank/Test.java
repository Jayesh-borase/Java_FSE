package com.Day4.Bank;

public class Test {
	public static void main(String[] args) {
		
		Accounts ac = new Accounts(5000);
		System.out.println(ac);
		
		try {
			ac.withdraw(50000);
		} catch (BalanceException e) {
			e.printStackTrace();		//Used for troubleshooting and getting the path of exception
			System.out.println(e);		//Used for logging	-> Audit System Behaviour
			System.out.println(e.getMessage());		//Used for end user just to show msg
		}
		
		
		/*
		System.out.println(ac);
		ac.withdraw(7000);
		System.out.println(ac);
		
		ac.deposit(2000);
		System.out.println(ac);
		
		ac.deposit(5000);
		System.out.println(ac);
		*/
	}
}
