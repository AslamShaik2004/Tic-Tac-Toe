package com.tictactoe;

import java.util.Random;

public class AIPlayer extends Player {


	Random r = new Random();

	public AIPlayer(String name, char mark) {
		this.name = name;
		this.mark = mark;
	}

	@Override
	void makeMove() {
		int row, col;
		do {
			row = r.nextInt(3);
			col = r.nextInt(3);
		} while (!isValidMove(row, col));
		TicTacToe.placeMark(row, col, mark);
		System.out.println("AI placed at: " + row + " " + col);
	}
}
