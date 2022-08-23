package com.aurionpro.model;

public class Game {

	private Player currentPlayer;
	Player[] players;
	Board board;
	ResultAnalyzer analyzer;
	ResultType result = ResultType.PROGRESS;

	public Game(Player currentPlayer, Player[] players, Board board, ResultAnalyzer analyzer) {
		super();
		this.currentPlayer = currentPlayer;
		this.players = players;
		this.board = board;
		this.analyzer = analyzer;
		// set mark for Player 1 and 2
	}

	public void play(int loc) {
	}

	private void switchCurrentPlayer() {
	}

	public Player getcurrentPlayer() {
		return currentPlayer;
	}

}
