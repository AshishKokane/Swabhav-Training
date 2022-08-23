package com.aurionpro.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("B");
		queue.add("D");
		queue.add("A");
		queue.add("C");
		queue.add("T");

		System.out.println("head:" + queue.peek());
		System.out.println("iterating the queue elements:");
		Iterator<String> itr = queue.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		queue.remove("B");
		System.out.println("-----------after removing element B-------------");

		Iterator<String> itr1 = queue.iterator();

		while (itr1.hasNext()) {
			System.out.println(itr1.next());

		}

		System.out.println("-------hash map sorting using priority queue using getValue---------");

		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("Dell", 10); // laptop and quantity
		map.put("HP", 5);
		map.put("Acer", 15);
		map.put("MSI", 6);

		// sorting in ascending based on values

		Queue<Map.Entry<String, Integer>> pqueue = new PriorityQueue<>((a, b) -> {
			return a.getValue() - b.getValue();
		}); // iterator

		for (Map.Entry<String, Integer> e : map.entrySet()) {
			pqueue.add(e);
		}

		while (!pqueue.isEmpty()) {
			System.out.println(pqueue.poll());

		}

	}
}
