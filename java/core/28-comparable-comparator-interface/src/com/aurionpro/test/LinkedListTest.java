package com.aurionpro.test;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		// class linked list
		LinkedList<String> alpha = new LinkedList<String>();

		// Adding elements to the linked list
		alpha.add("A");
		alpha.add("B");
		alpha.addLast("C");
		alpha.addFirst("D");
		alpha.add("B");
		alpha.add(2, "E");
		alpha.add("E");

		System.out.println(alpha);

//		alpha.remove("B");
//		alpha.remove(3);
//		alpha.removeFirst();
//		alpha.removeLast();
		System.out.println("-------------index value of A-----------");
		System.out.println(alpha.indexOf("A"));

		System.out.println("-------------peek-----------");
		System.out.println(alpha.peek());

		System.out.println("-------------pop-----------");

		alpha.pop();
		System.out.println(alpha);
		alpha.push("N");
		System.out.println("-------------push N-----------");

		System.out.println(alpha);
		System.out.println("----------------last occurred B remove ------------");

		alpha.removeLastOccurrence("B");
		System.out.println(alpha);

		System.out.println("----------------Firest occurred E remove ------------");
		alpha.removeFirstOccurrence("E");
		System.out.println(alpha);

	}

}
