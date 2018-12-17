package com.jls.payroll.model;

import com.jls.payroll.util.Hourly;

public class Staff {
	
	private StaffMember[] staffList;
	
	
	
	//constructor: sets up list of staff members
	
	public Staff() {
		staffList = new StaffMember[4];
		
		
		staffList[0] = new Executive("Bill Guy", "444 Cool St", "657-111-1000", "123-45-6789", 10000);
		
		staffList[1] = new Volunteer("Guy Bill", "555 Nice st", "657-000-000");
		
		staffList[2] = new Employee("Bud Pal", "666 Evil St", "657-111-001", "123-45-6780", 555.09);
		
		staffList[3] = new Hourly("Friend Pal", "666 Evil St", "657-111-002", "123-45-6790", 7.75);
		
		((Executive)staffList[0]).awardBonus(100000.01);
		
		((Hourly)staffList[3]).addHours(48);
		
		
		
		
	}
	
	
	public void payday() {
		double amount;
		
		for(int i = 0; i < staffList.length; i++) {
			System.out.println(staffList[i]);
			
			amount = staffList[i].pay();   //POLYMORphic
			
			if(amount == 0.0) 
				System.out.println("Thanks for your time!");
			else
				System.out.println("Paid: " + amount);
			
			
			System.out.println("--------------------------------------");
			
			
		}
	}
	
	
	

}
