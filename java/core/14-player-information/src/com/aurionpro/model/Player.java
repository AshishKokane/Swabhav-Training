package com.aurionpro.model;

public class Player {

	private int playerId;
	private int playerMatches;
	private int playerRuns;
	private int playerWickets;
	private String playerName;

	public Player(int playerId, int playerMatches, int playerRuns, int playerWickets, String playerName) {
		// super();
		this.playerId = playerId;
		this.playerMatches = playerMatches;
		this.playerRuns = playerRuns;
		this.playerWickets = playerWickets;
		this.playerName = playerName;
	}

	public int getPlayerId() {
		return playerId;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerMatches=" + playerMatches + ", playerRuns=" + playerRuns
				+ ", playerWickets=" + playerWickets + ", playerName=" + playerName + "]";
	}

	public int getPlayerMatches() {
		return playerMatches;
	}

	public int getPlayerRuns() {
		return playerRuns;
	}

	public int getPlayerWickets() {
		return playerWickets;
	}

	public String getPlayerName() {
		return playerName;
	}

}
