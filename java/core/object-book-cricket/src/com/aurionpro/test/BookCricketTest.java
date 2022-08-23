package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.BookCricket;
import com.aurionpro.model.Player;

public class BookCricketTest {

	public static void main(String[] args) {

		Player[] players = new Player[2];

		players[0] = new Player();
		players[1] = new Player();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Player 1 Name:-");
		players[0].setName(sc.next());
		System.out.println("Enter Player 2 Name:-");
		players[1].setName(sc.next());

		BookCricket bookcricket = new BookCricket();
		bookcricket.PlayGame(players);

		// bookcricket.getResult(players);

	}

}
