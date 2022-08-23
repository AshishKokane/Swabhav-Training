package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StramArrayTest {

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(10, 20, 30, 40, 50);
		stream.forEach(n -> System.out.println(n));

		Stream<String> stream1 = Stream.of("AA", "BB", "CC", "DD");
		stream1.forEach(n -> System.out.println(n));
		// System.out.println(stream1);
		// cannot use stream unitl no terminal operation

		List<String> players = Arrays.asList("Sachin", "Dhoni", "Virat");
		players.stream().forEach(n -> System.out.println(n));

//		Stream<String> str = Stream.generate(() -> "SomeText").limit(5);

		// str.forEach(n -> System.out.println(n));

		Stream.generate(() -> 123).limit(5).forEach(System.out::println);

	}

}
