package com.aurionpro.test;

import com.aurionpro.model.BMI;
import com.aurionpro.model.GenderOption;
import com.aurionpro.model.Person;

public class PlayerTest {

	public static void main(String[] args) {

		Person sachin = new Person(162, 54, "Sachin", GenderOption.MALE);

		BMI bmi = new BMI(sachin);

		Person Rohit = new Person(172, 57, "Rohit", GenderOption.MALE);

		BMI bmi1 = new BMI(Rohit);

		printdetails(bmi);

	}

	private static void printdetails(BMI bmi) {
		System.out.println(bmi.getPerson());
		System.out.println(bmi.getBmi());

		System.out.println(bmi.getBodyType());

	}

}
