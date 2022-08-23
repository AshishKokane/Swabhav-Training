package com.aurionpro.test;

public class ImmutableString {

	public static void main(String[] args) {
		String name = "Dinesh";

		System.out.println(name.hashCode());
		name = "Nitesh";
		System.out.println(name.hashCode());

		String name1 = new String("Nitesh").intern();
		if (name == name1) {
			System.out.println("equal"); // same obj
		}

		else {
			System.out.println("not equal");
		}

	}

}
