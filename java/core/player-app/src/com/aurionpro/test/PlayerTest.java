package com.aurionpro.test;

import com.aurionpro.model.Player;

public class PlayerTest {

	public static void main(String[] args) {
		Player Sachin = new Player("Sachin", 27);
		Player Rohit = new Player("Rohit", 25);

		System.out.println(Sachin);
		System.out.println(Rohit);

		String elderPlayer = Rohit.whoIsElder(Sachin);

		printElderPlayerDetails(elderPlayer);

	}

	private static void printElderPlayerDetails(String elderPlayer) {

		if (elderPlayer != null) {

			System.out.println("Name of Elder Player  = " + elderPlayer);

		}

		else {
			System.out.println("Both have same age");
		}

	}

}
