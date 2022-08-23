package com.aurionpro.test;

import com.aurionpro.model.Add;

public class AddTest {

	public static void main(String[] args) {
		Add addition = new Add();
		System.out.println(addition.add(10, 20));
		System.out.println(addition.add(10.5, 20.5));
		System.out.println(addition.add(10, 20, 30));
		System.out.println(addition.add(12.5, 20.5, 35.5));

	}

}
