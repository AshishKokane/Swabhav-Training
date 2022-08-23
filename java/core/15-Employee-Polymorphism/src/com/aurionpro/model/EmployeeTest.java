package com.aurionpro.model;

public class EmployeeTest {

	public static void main(String[] args) {

		Manager manager = new Manager(101, "ABC", 40000);

		printSalarySlip(manager);

		Developer developer = new Developer(201, "LMN", 24843);

		printSalarySlip(developer);

		Accountant accountant = new Accountant(301, "PQR", 30000);

		printSalarySlip(accountant);

	}

	private static void printSalarySlip(Employee employee) {

		System.out.println("--------------Salary Slip-----------------");

		System.out.println("Employee Number:-" + employee.getEmployeeNumber());
		System.out.println("Employee Name:-" + employee.getEmpName());
		System.out.println("Employee Basic Salary:-" + employee.getBasicSalary());

		if (employee.getHra() != 0)
			System.out.println("HRA:-" + employee.getHra());

		if (employee.getDa() != 0)
			System.out.println("DA:-" + employee.getDa());

		if (employee.getTa() != 0)
			System.out.println("TA:-" + employee.getTa());

		if (employee.getPa() != 0)
			System.out.println("PA:-" + employee.getPa());

		if (employee.getOt() != 0)
			System.out.println("OT:-" + employee.getOt());

		if (employee.getPerks() != 0)
			System.out.println("Perks:-" + employee.getPerks());

		System.out.println("___________________________________________");
		System.out.println("Annual CTC:-" + employee.calculateAnnualCTC());
		System.out.println("___________________________________________");
		// System.out.println("--------------Salary Slip-----------------");

		System.out.println("");
		System.out.println("");
	}

}
