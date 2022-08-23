package com.aurionpro.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeHashMap {

	public static void main(String[] args) {

		Employee[] employees = { new Employee(101, 200000, "abc"), new Employee(101, 250000, "lmn"),
				new Employee(101, 400000, "pqr"), };

		HashMap<Integer, Employee> empHash = new HashMap<Integer, Employee>();

		for (Employee emp : employees) {

			empHash.put(emp.getId(), emp);

		}

		Set<Map.Entry<Integer, Employee>> values1 = empHash.entrySet();

		for (Map.Entry<Integer, Employee> entries : values1) {

			System.out.println(entries.getKey() + " :-" + entries.getValue());

		}

	}

}
