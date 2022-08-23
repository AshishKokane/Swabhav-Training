package com.aurionpro.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {

	private int empId;
	private String empName;
	private double empSalary;
	private LocalDate date;

	public Employee(int empId, String empName, double empSalary, String userdate) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;

		this.date = dateInput(userdate);

	}

	public Employee(int empId, String empName, double empSalary, LocalDate userdate) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;

		this.date = userdate;

	}

	private LocalDate dateInput(String userdate) {

		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(userdate, dateFormat);
		return date;

	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", date=" + date
				+ "]";
	}

}
