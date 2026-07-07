package com.Day4.Bank;

public class Accounts {

	private double balance;
	private double overdraft;
	
	public Accounts(double balance) {
		this.balance = balance;
		overdraft = 10000;
	}
	
	
	
	@Override
	public String toString() {
		return "Balance : " + this.balance + " - OD : "+ overdraft;
	}


	private double negativeBal() {
		return (10000 - overdraft);
	}
	
	public void deposit(double amount) {
			if(amount < negativeBal()) overdraft += amount;
			else {
				this.balance += (amount - negativeBal());
				overdraft += negativeBal();
			}
	}
	
	public void withdraw(double amount) throws BalanceException {
		if(amount > balance + overdraft) {
			throw new BalanceException("Insufficient Balance");
		}
		else {
				if(amount > this.balance) {
				overdraft -= (amount - balance);
				this.balance = 0;
				}
				else this.balance -= amount;
		}
	}
	
	
}
