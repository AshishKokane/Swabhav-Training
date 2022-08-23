package com.aurionpro.test;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		int number, fact =1;
		System.out.println("hii");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		
		for(int i=number; i>=1;i--) {
			fact =fact*i;
		}
		
		System.out.println(fact);
		
				

	}

}
