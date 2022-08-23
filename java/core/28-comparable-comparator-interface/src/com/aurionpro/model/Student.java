package com.aurionpro.model;

public class Student implements Comparable<Student> {

	private int studentRoll;
	private int studentMarks;
	private String studentName;

	public Student(int studentRoll, int studentMarks, String studentName) {
		super();
		this.studentRoll = studentRoll;
		this.studentMarks = studentMarks;
		this.studentName = studentName;
	}

	public int getStudentRoll() {
		return studentRoll;
	}

	public int getStudentMarks() {
		return studentMarks;
	}

	public String getStudentName() {
		return studentName;
	}

	@Override
	public String toString() {
		return "Student [studentRoll=" + studentRoll + ", studentMarks=" + studentMarks + ", studentName=" + studentName
				+ "]";
	}

	@Override
	public int compareTo(Student s) {

		return studentRoll > s.studentRoll ? 1 : -1;

	}

}
