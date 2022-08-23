package com.aurionpro.test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DequeueQueue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Deque<String> dq = new ArrayDeque<String>();

		dq.add("comps");
		dq.add("IT");
		dq.add("Extc");
		dq.add("Mech");
		dq.add("Electronics");
		dq.add("civil");

		System.out.println("Queue operation using DeQueue");
		System.out.println("-----------------------------------------------");

		System.out.println(dq);

		System.out.println("Peek:-" + dq.peek());

		dq.addLast("AI");

		System.out.println(dq);

		System.out.println("Peek:-" + dq.peek());

		System.out.println("Poping:-" + dq.pollFirst());

		System.out.println("Poping:-" + dq.pollFirst());

		System.out.println("Poping:-" + dq.pollFirst());

		System.out.println("Poping:-" + dq.pollFirst());

		System.out.println("Poping:-" + dq.pollFirst());

		System.out.println("Poping:-" + dq.pollFirst());

		System.out.println("Poping:-" + dq.pollFirst());

		System.out.println("Poping:-" + dq.pollLast());

		System.out.println(dq);

	}
}
