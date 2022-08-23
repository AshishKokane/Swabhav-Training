package com.aurionpro.test;

import com.aurionpro.model.BranchType;
import com.aurionpro.model.Person;
import com.aurionpro.model.Professor;
import com.aurionpro.model.Student;

public class EngineeringTest {

	public static void main(String[] args) {
		Person student = new Student(101, "Thane", "4/02/2000", BranchType.COMPUTER);
		Professor professor = new Professor(201, "Sion", "22/12/1961", 1000);

		System.out.println("annyal salary:-" + professor.calculateSalary());

		System.out.println(student);
		System.out.println(professor);

	}

}
