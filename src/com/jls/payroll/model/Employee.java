package com.jls.payroll.model;

/**
 * @author joselsanchez
 * paid employee class
 *
 */
public class Employee extends StaffMember {
	
	protected String socialSecurityNumber;
	protected double payRate;
	
	
	public Employee(String eName, String eAddress, String ePhone, String socialSecurityNumber, double payRate) {
		super(eName, eAddress, ePhone);
		this.socialSecurityNumber = socialSecurityNumber;
		this.payRate = payRate;
	}
	
	public String toString () {
		
		String result = super.toString();
		
		result += "\nSocial Security Number: " + socialSecurityNumber;
		
		
		return result;
	}
	
	public double pay() {
		return payRate;
	}
	
		
	

}
