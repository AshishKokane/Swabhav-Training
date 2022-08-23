package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class AccountTest {

	public static void main(String[] args) {

		Account[] accounts = { new Account(101, "abc", 55000), new Account(102, "lmn", 55000),
				new Account(103, "pqr", 40000), new Account(104, "xyz", 35000), };

		Stream<Account> stream1 = Arrays.stream(accounts);
		Optional<Account> minbalance;
		minbalance = stream1.min(Comparator.comparingDouble(a -> a.getBalance()));

		minbalance.ifPresent(System.out::println);

		Stream<Account> stream2 = Arrays.stream(accounts);
		Optional<Account> maxbalance;
		maxbalance = stream2.max(Comparator.comparingDouble(a -> a.getBalance()));
//consumer direcly prints the value 
		maxbalance.ifPresent(n -> System.out.println(n));

	}

}
