package com.aurionpro.model;

public class RuntimeStackTrees {

	public static final String ANSI_RESET = "\u001B[0m";

	public static final String ANSI_YELLOW = "\u001B[33m";

	public static void main(String[] args) {

		try {
			method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block

		}
		System.out.println("End of main...");
		System.out.println(ANSI_YELLOW + "This text is yellow" + ANSI_RESET);

	}

	private static void method1() {
		method2();
		System.out.println("End of method1");

	}

	private static void method2() {
		method3();
		System.out.println("End of method2");

	}

	private static void method3() {
		throw new RuntimeException("Error in method 3");
		// System.out.println("End of method3");

	}

}
