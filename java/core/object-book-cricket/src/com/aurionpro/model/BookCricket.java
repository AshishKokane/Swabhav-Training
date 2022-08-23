package com.aurionpro.model;

import java.util.Scanner;

public class BookCricket {
	public static int target = 0;

	public void PlayGame(Player[] players) {

		Scanner sc = new Scanner(System.in);

		int playerNumber = 1;

		// int chase = 0;
		for (Player player : players) {

			System.out.println("Welcome Player::" + player.getName());

			System.out.println("Enter 1 To Start The Game and 0 to Exit");
			int start = sc.nextInt();
			if (start == 1) {
				int n, points, turns = 0, score = 0;
				String playe1Name = "";
				if (playerNumber == 1) {
					target = -1;

					playerNumber += 1;

					// chase++;

				}

				playe1Name = player.getName();

				do {

					System.out.print("Press 1 to Open Book: ");

					Scanner sc11 = new Scanner(System.in);
					n = sc11.nextInt();

					while (n != 1) {
						System.out.println("Input not 1 game stopped. re-enter 1 to continue..");
						n = sc11.nextInt();
						break;
					}

					int a = (int) (Math.random() * (300 - 0 + 1) + 0);

					points = a % 7;

					if (points != 0) {
						score = score + points;
						turns++;
						System.out.println("-----------------------");
						System.out.println("Page Number: " + a);
						System.out.println("Turn Score: " + points);
						System.out.println("Total Score: " + score);
						System.out.println("Round Number :" + turns);
						System.out.println("-----------------------");

						player.setRounds(turns);
						player.setScore(score);

					}

					else {
						target = player.getScore();

						turns++;
						System.out.println("-----------------------");
						System.out.println("Page Number: " + a);
						System.out.println("Turn Score: " + points);
						System.out.println("Total Score: " + score);
						System.out.println("Round Number :" + turns);

						System.out.println(" OOPS " + player.getName() + "  Out !!");
						System.out.println("Target to win::" + (score + 1) + " Runs");
						System.out.println("-----------------------------");

						player.setRounds(turns);
						player.setScore(score);

						break;

					}

				} while (target < player.getScore());

			}

			else {
				System.out.println(" Game Exited !");
				break;
			}

		}

		Player winner = getResult(players);

		System.out.println("Winner is:-" + winner);

	}

	public Player getResult(Player[] players) {
		Player player = players[0];
		for (int i = 0; i < players.length; i++) {
			if (players[i].getScore() > player.getScore()) {
				player = players[i];
			}

		}
		return player;
	}

}
