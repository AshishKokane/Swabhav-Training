package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 20, 20, 20, 23, 34, 45, 66, 76, 77, 77);

//		List<Integer> even = new ArrayList<Integer>();
//		List<Integer> odd = new ArrayList<Integer>();
//
//		for (Integer li : list) {
//
//			if (li % 2 == 0)
//				even.add(li);
//			else
//				odd.add(li);
//		}
//
//		System.out.println("List : " + list);
//		System.out.println("Even no : " + even);
//		System.out.println("Odd no : " + odd);

//		HashSet<Integer> hset = new HashSet<Integer>(list);
//		System.out.println("eliminate using set duplicate values: " + hset);

		System.out.println("---------------using stream below--------------------");

		list.stream().filter(n -> n % 2 == 0)

				.limit(5).distinct().forEach(System.out::println);

		// predicate i.e condition return true of false.

		System.out.println("---------storing in list using .collect----------------");
		List<Integer> evenlist = list.stream().filter(n -> n % 2 == 0).limit(6).distinct().collect(Collectors.toList());
		evenlist.stream().forEach(System.out::println);

	}

}
