package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public abstract class StreamString {

	public static void main(String[] args) {

		String[] names = { "Jay", "Nimesh", "Mark", "Mahesh", "Ramesh" };

//		a. print names of first 3 students sorted in ascending order
//		b. print names of first 3 students sorted in ascending order if their names contain 'a'
//		c. print names of students sorted in descending order
//		d. print first 3 characters of names of students
//		e. print the names of the students that contains less than or equal to 4 characters

		Stream<String> stream1 = Arrays.stream(names);

		System.out.println("-----print names of students sorted in descending order------");

		stream1.sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

		System.out.println(
				"----------------first 3 students sorted in ascending order if their names contain 'a'--------------");

		Stream<String> stream2 = Arrays.stream(names);

		stream2.filter(name -> name.toLowerCase().contains("a")).limit(3).forEach(System.out::println);

		System.out.println("------------1st 3 students------------------");

		Stream<String> stream3 = Arrays.stream(names);

		stream3.limit(3).forEach(System.out::println);

		System.out.println("---------names char less than or equal 4------------------");

		Stream<String> stream4 = Arrays.stream(names);

		stream4.filter(name -> name.length() <= 4).forEach(System.out::println);

		System.out.println("--------1st 3 char of student-----------------");

		Stream<String> stream5 = Arrays.stream(names);

		stream5.map(n -> n.substring(0, 3)).forEach(System.out::println);

	}

}