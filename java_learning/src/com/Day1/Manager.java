package com.Day1;

public class Manager extends Employee{

	private double commision;
	
	public Manager(double salary,double commision) {
		super(salary);
		this.commision = commision;
	}

	@Override
	public double getSalary() {
		return super.getSalary() + commision;
	}

	
}
