package com.tictactoe;

import java.util.Scanner;

public class HumanPlayer extends Player {
	private Scanner sc;
	
	public HumanPlayer(String name, char mark, Scanner sc) {
		this.name = name;
		this.mark = mark;
		this.sc = sc;
	}
	@Override
	void makeMove() {
		int row, col;
		do {
			System.out.println("Enter Row and Column(0-2 each): ");
			row = sc.nextInt();
			col = sc.nextInt();
		}while(!isValidMove(row,col));
		TicTacToe.placeMark(row, col, mark);
	}
}
