package com.aurionpro.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class OccurrenceTest {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
		numbers.add(20);
		numbers.add(10);
		numbers.add(10);
		numbers.add(30);
		numbers.add(30);
		numbers.add(30);
		int j = 0;

		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();

		for (int num : numbers) {

			count.put(numbers.get(j), 0);
			j += 1;

		}

		System.out.println(numbers);

		System.out.println("---------------------------------------------------------");

		int c = 0;
		for (int key : numbers) {
			if (count.containsKey(key)) {
				count.put(key, count.get(key) + 1);

			}

			else {
				count.put(key, 1);

			}
		}

		Set<Map.Entry<Integer, Integer>> values1 = count.entrySet();

		for (Map.Entry<Integer, Integer> entries : values1) {

			System.out.println(entries.getKey() + " :-" + entries.getValue());

		}

	}

}