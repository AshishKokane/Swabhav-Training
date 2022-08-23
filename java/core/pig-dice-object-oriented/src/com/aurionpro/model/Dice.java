package com.aurionpro.model;

import java.util.Random;

public class Dice {

	private int totalScore = 0;
	private int turnScore = 0;
	private int turns = 0;

	public int getTotalScore() {
		return totalScore;
	}

	public int getTurnScore() {
		return turnScore;
	}

	public int getTurns() {
		return turns;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public void setTurnScore(int turnScore) {
		this.turnScore = turnScore;
	}

	public void setTurns(int turns) {
		this.turns = turns;
	}

	@Override
	public String toString() {
		return "PigDice [ totalScore=" + totalScore + ", turnScore=" + turnScore + ", turns=" + turns + "]";
	}

	public int RandomDice() {
		Random random = new Random();
		int dice = 1 + random.nextInt(6);
		return dice;

	}

	public int playGame() {
		Random random = new Random();
		int dice = RandomDice();
		updateTurnScore(dice);
		return dice;

	}

	private void updateTurnScore(int dice) {
		if (dice == 1) {
			this.turnScore = 0;
		} else {
			this.turnScore += dice;
		}
	}

	public void updateTurnScoreToZero() {
		turnScore = 0;

	}

	public void incrementTurn() {
		turns++;
	}

	public void updateTotalScore() {
		totalScore += turnScore;
	}

}
