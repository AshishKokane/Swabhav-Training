package com.aurionpro.test;

import java.util.StringTokenizer;

public class StringTokenTest {

	public static void main(String[] args) {

		String sample = "hi, how;are you 123 sample";

		StringTokenizer stringTokens = new StringTokenizer(sample, ", ");// delimiters are not tokens

		System.out.println(" Tokens count Token = " + stringTokens.countTokens());
		while (stringTokens.hasMoreTokens()) {

			System.out.println(" Token no= " + stringTokens.countTokens() + " Token= " + stringTokens.nextToken());
			System.out.println(stringTokens.countTokens());
			// System.out.println(stringTokens.nextToken());
		}

		// System.out.println(" Tokens count Token = " + stringTokens.countTokens());

	}
}
