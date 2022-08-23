package com.aurionpro.model;

public class Player {

	private String playerName;
	private int playerAge;
	private int playerID;

	private static int count = 100;

	public Player(String playerName, int playerAge) {

		this.playerName = playerName;
		this.playerAge = playerAge;
		this.playerID = incrementID();
		// count++;

	}

	private int incrementID() {

		return count++;
	}

	public Player(String playerName) {

		this(playerName, 27);

	}

	public String getPlayerName() {
		return playerName;
	}

	public int getPlayerAge() {
		return playerAge;
	}

	public int getPlayerID() {
		return playerID;
	}

	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", playerAge=" + playerAge + ", playerID=" + playerID + "]";
	}

	public String whoIsElder(Player playerName) {

		if (this.playerAge > playerName.playerAge)
			return this.playerName;

		if (this.playerAge == playerName.playerAge)
			return null;

		return playerName.playerName;

	}

}
