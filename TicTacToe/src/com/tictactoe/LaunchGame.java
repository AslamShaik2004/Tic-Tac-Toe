package com.tictactoe;

import java.util.Scanner;

public class LaunchGame {
	public static void main(String[] args) {
		System.out.println();
		System.out.println("      TIC TAC TOE");
		System.out.println("----------------------");

		Scanner sc = new Scanner(System.in);
		System.out.println("Select Option: \n 1. Multiplaayer \n 2. Play With AI");
		System.out.println("Option 1 or 2: ");
		int option = sc.nextInt();

		TicTacToe t =  new TicTacToe();

		Player p1;
		Player p2;

		if(option==1) {
			System.out.println("Enter Player 1 Name: ");
			String name1= sc.next();
			System.out.println("Enter Player 2 Name: ");
			String name2= sc.next();
			p1 = new HumanPlayer(name1, 'X',sc);
			p2 = new HumanPlayer(name2, 'O',sc);
		}else {
			System.out.println("Enter Player Name: ");
			String name = sc.next();
			p1 = new HumanPlayer(name, 'X',sc);
			p2 = new AIPlayer("AI", 'O');
		}
		Player cp = p1; //cp=current player
		t.displayBoard();
		while(true) {
			System.out.println(cp.name + "'s Turn");
			cp.makeMove();
			t.displayBoard();

			if(TicTacToe.rowWin() || TicTacToe.colWin() || TicTacToe.diagonalWin()) {
				System.out.println(cp.name + " Won 🎉");
				break;
			}else if(TicTacToe.isDraw()) {
				System.out.println("It's a Draw 🤝");
				break;
			}else {
				cp = (cp==p1) ? p2 : p1;
			}
		}
	}
}
