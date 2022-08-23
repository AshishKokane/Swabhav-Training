package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamPractise {

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
//		num.stream()
//		.map(String::valueOf)
//		.forEach(System.out::println);
//
		num.stream().map(e -> String.valueOf(e)).map(e -> e.toString()).map(String::toString)
				.forEach(System.out::println);

		num.stream().reduce(0, (total, e) -> Integer.sum(total, e));
//
		System.out.println(num.stream().reduce(0, (Integer::sum)));
//
		System.out.println(num.stream().map(String::valueOf).reduce("", (carry, str) -> carry.concat(str)));
//
		System.out.println(num.stream().map(String::valueOf).reduce("", (String::concat)));
//
//		System.out.println(num.stream().filter(e -> e % 2 == 0).map(e -> e * 2).reduce(0, Integer::sum));
//
//		System.out.println(num.stream().filter(e -> e % 2 == 0).mapToInt(e -> e * 2).sum());
//
//		System.out.println(num.stream().filter(e -> e % 2 == 0).mapToInt(e -> compute(e)).sum());
//
//		System.out.println(num.stream().filter(e -> e % 2 == 0).mapToInt(StreamPractise::compute).sum());
//
//		

		List<Order> orders = new ArrayList<Order>();
		orders.add(new Order(101, "Bag", 4500));
		orders.add(new Order(104, "Bag", 5500));
		orders.add(new Order(102, "phone", 7500));
		orders.add(new Order(103, "Book", 4500));

		Map<Integer, Order> idmapp = orders.stream().collect(Collectors.toMap(Order::getOrederId, Function.identity()));

		System.out.println(idmapp);

		System.out.println("----------------------------------");
		System.out.println(idmapp.containsKey(102));
		System.out.println(idmapp.get(102));

		Map<Integer, String> idmapp1 = orders.stream()
				.collect(Collectors.toMap(Order::getOrederId, Order::getOrderName));

		System.out.println(idmapp1);

	}

	public static int compute(int num) {

		return num * 3;

	}

}
