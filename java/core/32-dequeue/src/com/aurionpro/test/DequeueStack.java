package com.aurionpro.test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DequeueStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Deque<String> dq = new ArrayDeque<String>();

		dq.add("comps");
		dq.addLast("IT");
		dq.addLast("Extc");
		dq.addLast("Mech");
		dq.addLast("Electronics");
		dq.addLast("civil");

		System.out.println("Stack operation using DeQueue");
		System.out.println("-----------------------------------------------");

		System.out.println(dq);

		System.out.println("Peek:-" + dq.peekLast());

		dq.addLast("AI");

		System.out.println(dq);

		System.out.println("Peek:-" + dq.peekLast());

		System.out.println("Poping:-" + dq.pollLast());
		System.out.println("Poping:-" + dq.pollLast());
		System.out.println("Poping:-" + dq.pollLast());
		System.out.println("Poping:-" + dq.pollLast());
		System.out.println("Poping:-" + dq.pollLast());
		System.out.println("Poping:-" + dq.pollLast());

		System.out.println("Poping:-" + dq.pollLast());

		System.out.println(dq);

	}
}
