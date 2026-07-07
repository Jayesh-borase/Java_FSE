package com.Day1;

public class clerk extends Employee{

	private double bonus;
	
	public clerk(double salary,double bonus) {
		super(salary);
		this.bonus = bonus;
	}

	@Override
	public double getSalary() {
		return super.getSalary() + bonus;
	}
	
}
