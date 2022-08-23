package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.model.Employees;

public class EmployeeTest {

	public static void main(String[] args) throws CloneNotSupportedException {

	
		
		List employees = insertData();
		Employees emps = new Employees(employees);

		
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("dhruv");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("dhruv");

		System.out.println("emps List: " + emps.getEmpList());
		System.out.println("empsNew List: " + list);
		System.out.println("empsNew1 List: " + list1);

	}
	
	public static List<String> insertData(){
		List<String> empList = new ArrayList<>();
		
		empList.add("abc");
		empList.add("pqr");
		empList.add("lmn");
		empList.add("xyz");
	
		return empList;
		
	}

}
