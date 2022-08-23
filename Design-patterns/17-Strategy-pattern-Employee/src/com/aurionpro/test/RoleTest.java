package com.aurionpro.test;

import com.aurionpro.model.Consultant;
import com.aurionpro.model.Employee;
import com.aurionpro.model.SeniorConsultant;
import com.aurionpro.model.TechLead;

public class RoleTest {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(101, "abc", new Consultant());
		
		System.out.println(
		emp1.getDescription() + " " + 
		emp1.getResponsibility());
		
		emp1.promote(new SeniorConsultant());
		
		
		System.out.println(
		emp1.getDescription() + " " + 
		emp1.getResponsibility());
		
//		System.out.println(emp1);
		
		
	emp1.promote(new TechLead());
		
		
		System.out.println(
		emp1.getDescription() + " " + 
		emp1.getResponsibility());
		
//		System.out.println(emp1);
		
	}

}
