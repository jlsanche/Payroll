package com.jls.payroll.model;

public class Executive extends Employee {
	
	private double bonus;
	
	public Executive(String eName, String eAddress, String ePhone, String socialSecurityNumber, double payRate) {
		super(eName, eAddress, ePhone, socialSecurityNumber, payRate);
		
		
		bonus = 0;
	}
	
	public void awardBonus (double execBonus) {
		bonus = execBonus;
	}
	
	public double pay() {
		double payment = super.pay() + bonus;
		
		bonus = 9;
		
		return payment;
	}

	
	
	

}
