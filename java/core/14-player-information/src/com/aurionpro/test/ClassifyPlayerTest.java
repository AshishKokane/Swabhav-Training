package com.aurionpro.test;

import java.util.ArrayList;

import com.aurionpro.model.Player;
import com.aurionpro.model.PlayerInfo;

public class ClassifyPlayerTest {

	public static void main(String[] args) {

		ArrayList<Player> players = new ArrayList<Player>();
		players.add(new Player(101, 200, 5000, 160, "sachin"));
		players.add(new Player(102, 40, 300, 80, "rohit"));
		players.add(new Player(103, 55, 100, 70, "ashish"));
		players.add(new Player(104, 20, 400, 10, "hardik"));
		players.add(new Player(105, 30, 500, 16, "ishan"));
		players.add(new Player(106, 1, 500, 80, "john"));

		PlayerInfo p = new PlayerInfo(players);

		ArrayList<Player> aLister = p.getAlisters();
		ArrayList<Player> bLister = p.getBlisters();
		ArrayList<Player> cLister = p.getClisters();

		System.out.println("A list players");
		viewDetails(aLister);
		System.out.println("---------------");

		System.out.println("B list players");
		viewDetails(bLister);
		System.out.println("---------------");
		System.out.println("C list players");
		viewDetails(cLister);

	}

	private static void viewDetails(ArrayList<Player> aLister) {

		for (Player player : aLister) {

			System.out.println(player);

		}
	}
}
