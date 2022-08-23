package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.aurionpro.model.ConsoleColors;
import com.aurionpro.model.Student;

public class ComparableTest {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();

		students.add(new Student(6, 76, "FF"));
		students.add(new Student(3, 75, "CC"));
		students.add(new Student(8, 87, "HH"));
		students.add(new Student(9, 70, "II"));
		students.add(new Student(4, 82, "DD"));
		students.add(new Student(5, 89, "EE"));
		students.add(new Student(7, 85, "GG"));
		students.add(new Student(10, 90, "JJ"));
		students.add(new Student(2, 80, "BB"));
		students.add(new Student(11, 93, "KK"));
		students.add(new Student(1, 78, "AA"));

		for (Student student : students) {
			System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT + "  Student Roll No: " + ConsoleColors.BLUE_BOLD
					+ student.getStudentRoll() + ConsoleColors.RESET +

					ConsoleColors.PURPLE_BOLD_BRIGHT + "  Student Name: " + ConsoleColors.BLUE_BOLD
					+ student.getStudentName() + ConsoleColors.RESET +

					ConsoleColors.PURPLE_BOLD_BRIGHT + "  Student Marks: " + ConsoleColors.BLUE_BOLD
					+ student.getStudentMarks() + ConsoleColors.RESET);

			System.out.println("  ________________________________________________________");

		}

		Collections.sort(students);

		System.out.println("---------------After sorting with Roll Number---------------");
		System.out.println("");

		for (Student student : students) {
			System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT + "  Student Roll No: " + ConsoleColors.BLUE_BOLD
					+ student.getStudentRoll() + ConsoleColors.RESET +

					ConsoleColors.PURPLE_BOLD_BRIGHT + "  Student Name: " + ConsoleColors.BLUE_BOLD
					+ student.getStudentName() + ConsoleColors.RESET +

					ConsoleColors.PURPLE_BOLD_BRIGHT + "  Student Marks: " + ConsoleColors.BLUE_BOLD
					+ student.getStudentMarks() + ConsoleColors.RESET);

			System.out.println("  ________________________________________________________");

		}

		Collections.sort(students, (i, j) -> i.getStudentMarks() > j.getStudentMarks() ? 1 : -1);

		System.out.println("--------------- After sorting with Marks ---------------");
		System.out.println("");

		for (Student student : students) {
			System.out.println(ConsoleColors.PURPLE_BOLD_BRIGHT + "  Student Roll No: " + ConsoleColors.BLUE_BOLD
					+ student.getStudentRoll() + ConsoleColors.RESET +

					ConsoleColors.PURPLE_BOLD_BRIGHT + "  Student Name: " + ConsoleColors.BLUE_BOLD
					+ student.getStudentName() + ConsoleColors.RESET +

					ConsoleColors.PURPLE_BOLD_BRIGHT + "  Student Marks: " + ConsoleColors.BLUE_BOLD
					+ student.getStudentMarks() + ConsoleColors.RESET);

			System.out.println("  ________________________________________________________");

		}

	}

}
