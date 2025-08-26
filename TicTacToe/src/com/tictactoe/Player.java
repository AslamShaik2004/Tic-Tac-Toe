package com.tictactoe;

abstract class Player {
	String name;
	char mark;
	
	abstract void makeMove();
	
	boolean isValidMove(int row, int col) {
		if(row>=0 && row<=2 && col>=0 && col<=2) {
			return TicTacToe.board[row][col]==' ';
		}
		return false;
	}
}
