package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.PigDice;

public class PicDiceTest {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("----Welcome To Pig Dice Game----");

		PigDice player = new PigDice();

		while (player.getTotalScore() < 20) {

			StartGame(player);

		}

		System.out.println("!!! You Won !!!");

		// printScoreDetails(player);

	}

	private static String GameInput() {

		Scanner sc = new Scanner(System.in);
		String ch = sc.next();

		return ch;
	}

	private static void StartGame(PigDice player) {

		System.out.println("Roll or Hold?(r/h)");

		String option = GameInput();

		if (option.equalsIgnoreCase("h")) {

			holdDice(player);
			return;
		} else if (option.equalsIgnoreCase("r")) {
			rollDice(player);
		}

		else {
			System.out.println("Enter valid option r/h");
		}

	}

	private static int rollDice(PigDice player) {

		int diceNumber;
		diceNumber = player.playGame();
		System.out.println("DICE:-" + diceNumber);
		if (diceNumber == 1) {
			reset(player);
		}
		return diceNumber;

	}

	private static void reset(PigDice player) {
		System.out.println("Turn Over !!");
		player.incrementTurn();
		printScoreDetails(player);
		System.out.println("TURN " + (player.getTurns() + 1));

	}

	private static void holdDice(PigDice player) {
		player.updateTotalScore();
		player.incrementTurn();
		printScoreDetails(player);
		player.updateTurnScoreToZero();

		if (player.getTotalScore() < 20)
			System.out.println("TURN " + (player.getTurns() + 1));

	}

	private static void printScoreDetails(PigDice player) {

		System.out.println("=================================");

		System.out.println(player);

	}

}
