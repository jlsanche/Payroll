package com.jls.payroll.model;

/**
 * @author joselsanchez
 *
 */

public abstract class StaffMember {
	
	protected String name;
	protected String address;
	protected String phone;
	
	
	//constructor
	
	public StaffMember (String eName, String eAddress, String ePhone) {
		name = eName;
		address = eAddress;
		phone = ePhone;
	}

	
	//returns a string including basic employee information
	
	public String toString () {
		
		String result = "Name: " + name + "\n";
		
		result += "Address: " + address + "\n";
		
		result += "Phone: " + phone + "\n";
		
		return result;
		
	}
	
	
	
	public abstract double pay();

	

}
