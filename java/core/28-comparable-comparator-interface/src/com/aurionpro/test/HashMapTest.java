package com.aurionpro.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.aurionpro.model.ConsoleColors;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<String, String> phonebook = new HashMap<>();
		phonebook.put("ashish", "8870114452");
		phonebook.put("dhruv", "9934672394");
		phonebook.put("gaurav", "7765032693");
		phonebook.put("yash", "9763496045");
		System.out.println(phonebook.remove("abc"));
		Set<String> keys = phonebook.keySet();

		System.out.println("-------------usings sets to store keys -------------------");
		System.out.println();

		for (String key : keys) {
			System.out
					.println(ConsoleColors.BLACK_BOLD + ConsoleColors.BLACK_ITALIC + key + " :-" + phonebook.get(key));
		}
		System.out.println();

		System.out.println("--------------map entry interface-------------------");
		System.out.println();

// entry inteface inside map interface

		Set<Map.Entry<String, String>> values = phonebook.entrySet();
// values contains key and value pair for entry

		for (Map.Entry<String, String> entries : values) {
			// entries.setValue("III");
			System.out.println(
					ConsoleColors.BLACK_BOLD + entries.getKey() + " :-" + entries.getValue() + ConsoleColors.RESET);
		}

		System.out.println();
		System.out.println("-----------------cloned----------------");
		System.out.println();

		HashMap<String, String> clonedPhonebook = (HashMap<String, String>) phonebook.clone();

		// System.out.println("cloned:-" + clonedPhonebook);

		clonedPhonebook.forEach((k, v) -> System.out.println(k + " : " + (v)));

	}

}
