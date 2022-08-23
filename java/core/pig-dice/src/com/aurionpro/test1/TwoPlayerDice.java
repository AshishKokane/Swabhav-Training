package com.aurionpro.test1;

import java.util.Random;
import java.util.Scanner;

public class TwoPlayerDice {

	public static void main(String[] args) {

		System.out.println("PIG DICE GAME");
		System.out.println("* See how many turns it takes you to get to 20");
		System.out.println("* Turn ends when you hold or roll a 1");
		System.out.println("* If you roll a 1, you lose all points for the turn");
		System.out.println("* if you hold, you save all points for the turn");

		int sum = 0, turn = 0, player1score = 0, player1turn = 0, turnscore = 0, n = 1, player2turn = 0,
				player2score = 0;

		char ch;
		int dice = 0;

		do {
			System.out.println("---------------------------");
			System.out.println("Player " + n + " Turn Starts");

			while (sum < 20) {

				turn++;
				turnscore = 0;
				dice = 0;

				System.out.println("\nTURN " + turn);
				System.out.println("-----------------------");

				while (dice != 1) {

					System.out.println("Roll or Hold?(r/h)");
					Scanner sc = new Scanner(System.in);
					ch = sc.next().charAt(0);

					if (ch == 'r') {
						Random random = new Random();
						dice = 1 + random.nextInt(6);
						System.out.println("Die: " + dice);

						turnscore = dice + turnscore;

						if (dice == 1) {

							System.out.println("Turn Over. No Score");
							// turnscore=0;
						}
					}

					if (ch == 'h') {

						sum = sum + turnscore;
						System.out.println("Score For Turn : " + turnscore);
						System.out.println("Total Score " + sum);
						// turnscore=0;
						break;
					}

					else {
						System.out.println("Please Enter r/h ");
					}

				}

			}
			System.out.println("Total Turns : " + turn);

			if (n == 1) {
				player1score = sum;
				player1turn = turn;

				sum = 0;
				turn = 0;
			}

			else {
				player2score = sum;
				player2turn = turn;
			}

			n++;
		} while (n < 3);

		if (player1turn < player2turn) {
			System.out.println("-----------------");

			System.out.println("Player 1 Wins !!");
			System.out.println("Player 1 Took " + player1turn + " turns");
		}

		else if (player1turn > player2turn) {

			System.out.println("-----------------");

			System.out.println("Player 2 Wins !!");
			System.out.println("Player 2 Took " + player2turn + " turns");
		}

		else if (player1turn == player2turn) {

			if (player1score > player2score) {
				System.out.println("-----------------");

				System.out.println("Player 1 Wins !!");
				System.out.println("Player 1 Took " + player1turn + " turns");
				System.out.println("Player 1 Score is  " + player1score);
			}

			else {
				System.out.println("-----------------");

				System.out.println("Player 2 Wins !!");
				System.out.println("Player 2 Took " + player2turn + " turns");
				System.out.println("Player 2 Score is  " + player2score);
			}

		}

	}

}
