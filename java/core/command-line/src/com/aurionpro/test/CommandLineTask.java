package com.aurionpro.test;

import java.util.Arrays;

public class CommandLineTask {

	public static void main(String[] args) {

		int sum = 0;
		int arr[] = new int[args.length];
		int n = args.length; // n = total no of elements
		int freq[] = new int[n]; // array to store freq of element
		int counter, visited;

		System.out.println("Entered elements are:");
		for (int i = 0; i < n; i++) {

			System.out.print(args[i] + " ");

		}

		for (int i = 0; i < n; i++) {

			sum = sum + Integer.parseInt(args[i]);
			arr[i] = Integer.parseInt(args[i]);

		}

		System.out.println();
		CommandLineTask c = new CommandLineTask();
		int total = c.sum(arr);
		System.out.println("sum of elements:-" + total);

		System.out.println("Average of all elements:" + average(arr));

		minMax(arr);

		Median(arr);

		Frequency(arr);

	}

	public static int Frequency(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length; // n = total no of elements
		int freq[] = new int[n]; // array to store freq of element
		int counter, visited;

		visited = -1;
		for (int i = 0; i < n; i++) {

			counter = 1;

			for (int j = i + 1; j < n; j++) {

				if (arr[i] == arr[j]) {
					counter++;
					freq[j] = visited;
				}

			}

			if (freq[i] != visited) {
				freq[i] = counter;
			}

		}

		System.out.println("Elements := Frequency");
		for (int i = 0; i < freq.length; i++) {

			if (freq[i] != visited) {

				System.out.println(arr[i] + "        :=  " + freq[i]);
			}
		}

		return 0;
	}

	public static int Median(int[] arr) {

		int n = arr.length;

		if (n % 2 != 0)
			System.out.println("Median:-" + arr[n / 2]); // if total elements are odd take middle value

		else
			System.out.println("Median:-" + (arr[(n - 1) / 2] + arr[n / 2]) / 2.0);

		return 0;

	}

	public static int minMax(int arr[]) {

		int n = arr.length;

		Arrays.sort(arr);
		System.out.println("min value:-" + arr[0]);

		System.out.println("max value:-" + arr[n - 1]);

		return 0;
	}

	public static float average(int arr[]) {
		int n = arr.length;
		float sum = sum(arr);
		float avg = sum / n;
		return avg;
	}

	public static int sum(int arr[]) {

		int sum = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {

			sum = sum + arr[i];

		}
		return sum;
	}

}