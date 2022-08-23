package com.aurionpro.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.aurionpro.test.Employee2;

public class EmployeeTest2 {

	public static void main(String[] args) {

		String pattern = "MM/dd/yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);

		try {

			Employee2 emp2 = new Employee2(101, "abc", 25000, sdf.parse("02/04/2022"));

			System.out.println(emp2);

			emp2.setDate(sdf.parse("03/04/2022"));

			System.out.println(emp2);

		} catch (ParseException e) {

		}

	}

}
