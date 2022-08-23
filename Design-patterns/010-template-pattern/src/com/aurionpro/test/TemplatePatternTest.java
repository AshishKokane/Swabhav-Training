package com.aurionpro.test;

import com.aurionpro.model.Cricket;
import com.aurionpro.model.Football;
import com.aurionpro.model.Game;

public class TemplatePatternTest {

	public static void main(String[] args) {

		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
	}

}
