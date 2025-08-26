package com.tictactoe;

public class TicTacToe {

	static char[][] board;

    public TicTacToe() {
        board = new char[3][3];
        initBoard();
    }

	void initBoard() {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				board[i][j]= ' ';
			}
		}
	}
	void displayBoard() {
		System.out.println("     0     1     2");
		System.out.println("  -------------------");
		for (int i = 0; i < board.length; i++) {
			System.out.print(i + " ");
			System.out.print("|  ");
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + "  |  ");
			}
			System.out.println();
			System.out.println("  -------------------");
		}
	}


	public static void placeMark(int row, int col, char mark) {
		if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
			board[row][col] = mark;
		} else {
			System.out.println("Invalid Position");
		}
	}

	public static boolean rowWin() {
		for (int i = 0; i < board.length; i++) {
			if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
				return true;
			}
		}
		return false;
	}

	public static boolean colWin() {
		for (int j = 0; j < board.length; j++) {
			if (board[0][j] != ' ' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
				return true;
			}
		}
		return false;
	}

	public static boolean diagonalWin() {
		return (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) ||
				(board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]);
	}


	static boolean isDraw() {
		for (int i = 0; i < TicTacToe.board.length; i++) {
			for (int j = 0; j < TicTacToe.board[i].length; j++) {
				if (TicTacToe.board[i][j] == ' ') {
					return false; // still empty cells -> not a draw
				}
			}
		}
		return true; // no empty cells and nobody has won -> draw
	}
}
