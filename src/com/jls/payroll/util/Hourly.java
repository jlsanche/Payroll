package com.jls.payroll.util;

import com.jls.payroll.model.Employee;

public class Hourly extends Employee {
	
	private int hoursWorked;

	
	//Constructor 
	
	public Hourly(String eName, String eAddress, String ePhone, String socialSecurityNumber, double payRate) {
		super(eName, eAddress, ePhone, socialSecurityNumber, payRate);
		
		hoursWorked = 0;

		
	}
	
	public void addHours ( int moreHours) {
		hoursWorked += moreHours;
	}
	
	public double pay() {
		double payment = payRate * hoursWorked;
		
		hoursWorked = 0;
		
		return payment;
	}


	public String toString() {
		
		String result = super.toString();
		
		result += "\nCurrent hours: " + hoursWorked;
		
		return result;
	}

}
