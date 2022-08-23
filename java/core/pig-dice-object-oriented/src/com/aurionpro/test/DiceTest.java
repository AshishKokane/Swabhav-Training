package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.aurionpro.model.Dice;

public class DiceTest {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("----Welcome To Pig Dice Game----");
		System.out.println("enter no of player:=");
		int no = sc.nextInt();

		Dice[] players = new Dice[no];
		List<Dice> list = new ArrayList<>(no);
		// object.add(players);

		for (Dice player : players)

		{

			list.add(player);

			while (player.getTotalScore() <= 20) {

				StartGame(player);

			}

			// player.updateTotalScore();
			System.out.println("!!! You Won !!!");
			// player.incrementTurn();
			printScoreDetails(player);
			player.updateTotalScore();
			player.incrementTurn();
			player.updateTurnScoreToZero();

		}

	}

	private static String GameInput() {

		Scanner sc = new Scanner(System.in);
		String ch = sc.next();

		return ch;
	}

	private static void StartGame(Dice player) {

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

	private static int rollDice(Dice player) {

		int diceNumber;
		diceNumber = player.playGame();
		System.out.println(diceNumber);
		if (diceNumber == 1) {
			reset(player);
		}
		return diceNumber;

	}

	private static void reset(Dice player) {
		System.out.println("Turn Over !!");
		player.incrementTurn();
		printScoreDetails(player);
		System.out.println("TURN " + (player.getTurns() + 1));

	}

	private static void holdDice(Dice player) {
		player.updateTotalScore();
		player.incrementTurn();

		// player.updateTurnScoreToZero();
		System.out.println("TURN " + (player.getTurns() + 1));
		printScoreDetails(player);

	}

	private static void printScoreDetails(Dice player) {

		System.out.println("=================================");

		System.out.println(player);

	}

}
