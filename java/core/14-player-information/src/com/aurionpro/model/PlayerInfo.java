package com.aurionpro.model;

import java.util.ArrayList;

public class PlayerInfo {

	public ArrayList<Player> players;

	public PlayerInfo(ArrayList<Player> players) {
		// super();
		this.players = players;
	}

	ArrayList<Player> playerA = new ArrayList<>();
	ArrayList<Player> playerB = new ArrayList<>();
	ArrayList<Player> playerC = new ArrayList<>();

	public ArrayList<Player> getAlisters() {

		// ArrayList<Player> playerA = new ArrayList<>();

		for (Player player : players) {

			if (validatePlayerA(player)) {
				playerA.add(player);
			}

		}
		return playerA;
	}

	public ArrayList<Player> getBlisters() {

		// ArrayList<Player> playerB = new ArrayList<>();

		for (Player player : players) {

			if (validatePlayerB(player)) {
				playerB.add(player);
			}

		}
		return playerB;
	}

	public ArrayList<Player> getClisters() {

		// ArrayList<Player> playerC = new ArrayList<>();

//		for (Player player : players) {
//
//			if (validatePlayerC(player)) {
//				playerC.add(player);
//			}
//
//		}

		for (Player player : players) {

			if (!playerA.contains(player) || !playerB.contains(player))
				playerC.add(player);
		}

		return playerC;
	}

//	public Player[] getBlisters() {
//		int count = 0;
//
//		Player[] playerB = new Player[player.length];
//
//		for (int i = 0; i < player.length; i++) {
//
//			if (validatePlayerB(player[i])) {
//
//				playerB[count] = player[i];
//				count += 1;
//			}
//
//		}
//
//		return playerB;
//
//	}
//
//	public Player[] getClisters() {
//		int count = 0;
//
//		Player[] playerC = new Player[player.length];
//
//		for (Player p : player) {
//			if (validatePlayerC(p)) {
//				playerC[count] = p;
//				count += 1;
//			}
//		}

//		for (int i = 0; i < player.length; i++) {
//
//			if (validatePlayerC(player[i])) {
//				playerC[count] = player[i];
//				count += 1;
//
//			}
//
//		}
//	return playerC;
//
//	}
//
//	public int maxScore() {
//		int maxScoreplayer = 0;
//
//		for (int i = 0; i < player.length; i++) {
//
//			if (player[i].getPlayerRuns() > maxScoreplayer) {
//				maxScoreplayer = player[i].getPlayerRuns();
//			}
//		}
//		return maxScoreplayer;
//	}
//
//	public int maxWickets() {
//		int maxwicket = 0;
//
//		for (int i = 0; i < player.length; i++) {
//
//			if (player[i].getPlayerWickets() > maxwicket) {
//				maxwicket = player[i].getPlayerWickets();
//			}
//		}
//		return maxwicket;
//	}

//	private boolean validatePlayerC(Player player) {
//		if (player.getPlayerMatches() < 50 && player.getPlayerRuns() < 3000 || player.getPlayerWickets() < 75) {
//			return true;
//		}
//		return false;
//	}

	private boolean validatePlayerB(Player player) {
		if (player.getPlayerMatches() > 50 && (player.getPlayerRuns() > 3000 && player.getPlayerRuns() < 5000)
				|| (player.getPlayerWickets() > 75 && player.getPlayerWickets() < 150)) {
			return true;
		}

		return false;
	}

	private boolean validatePlayerA(Player player) {
		if (player.getPlayerMatches() > 100 && player.getPlayerRuns() > 5000 || player.getPlayerWickets() > 150) {
			return true;
		}
		return false;
	}

}
