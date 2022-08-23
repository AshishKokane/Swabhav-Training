package com.aurionpro.model;

public class ExceptionStackTrees {
	public static void main(String[] args) {

		try {
			method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block

		}
		System.out.println("End of main...");

	}

	private static void method1() throws Exception {
		try {
			method2();
		} catch (Exception e) {
			// TODO Auto-generated catch block

		}
		System.out.println("End of method1");

	}

	private static void method2() throws Exception {
		try {
			method3();
			System.out.println("End of method2");
		} catch (Exception e) {
			// TODO Auto-generated catch block

		}

	}

	private static void method3() throws Exception {
		throw new Exception("Error in method 3");
		// System.out.println("End of method3");

	}

}
