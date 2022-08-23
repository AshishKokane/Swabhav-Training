package com.aurionpro.model;

public class ExceptionDemo {

	public static void main(String[] args) {

		int c = 0;
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);

			c = a / b;

			System.out.println("Inside try after exception");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exceptipn handled");
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException handled");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException handled");
		} catch (RuntimeException e) {
			System.out.println("Number Format exception handled");

		} catch (Exception e) {
			System.out.println("Exception handled:=" + e);
		}

		finally {
			System.out.println("finally block.......");
		}

		System.out.println("Division:-" + c);

	}

}
