package com.aurionpro.model;

public class Player {

	private String name;
	private int score;
	private int rounds;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isWinner(Player player) {

		return false;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", score=" + score + ", rounds=" + rounds + "]";
	}

}
