package kidOYO;

import java.util.Scanner;

public class TicTacToe {
	static boolean done = false;
	static char[][] tttBoard = new char[3][3];

	public static void main(String[] args) {
		for (int i = 0; i < tttBoard.length; i++) {
			for (int j = 0; j < tttBoard[i].length; j++) {
				tttBoard[i][j] = ' ';
			}
		}
		System.out.println("Welcome to Tic-Tac-Toe:\n");
		printBoard();
		while (!done) {
			playerTurn();
			printBoard();
			checkWin();
			comTurn();
			printBoard();
			checkWin();
		}
	}

	public static void checkWin() {
		boolean comWin = false, playerWin = false, draw = false;
		if ((tttBoard[0][0] == 'X' && tttBoard[0][1] == 'X' && tttBoard[0][2] == 'X') || // row0
				(tttBoard[1][0] == 'X' && tttBoard[1][1] == 'X' && tttBoard[1][2] == 'X') || // row1
				(tttBoard[2][0] == 'X' && tttBoard[2][1] == 'X' && tttBoard[2][2] == 'X') || // row2
				(tttBoard[0][0] == 'X' && tttBoard[1][0] == 'X' && tttBoard[2][0] == 'X') || // col0
				(tttBoard[0][1] == 'X' && tttBoard[1][1] == 'X' && tttBoard[2][1] == 'X') || // col1
				(tttBoard[0][2] == 'X' && tttBoard[1][2] == 'X' && tttBoard[2][2] == 'X') || // col2
				(tttBoard[0][0] == 'X' && tttBoard[1][1] == 'X' && tttBoard[2][2] == 'X') || // mainDiag
				(tttBoard[0][2] == 'X' && tttBoard[1][1] == 'X' && tttBoard[2][0] == 'X')) {// lesserDiag
			comWin = false;
			draw = false;
			playerWin = true;
			done = true;
		}
		if ((tttBoard[0][0] == 'O' && tttBoard[0][1] == 'O' && tttBoard[0][2] == 'O') || // row0
				(tttBoard[1][0] == 'O' && tttBoard[1][1] == 'O' && tttBoard[1][2] == 'O') || // row1
				(tttBoard[2][0] == 'O' && tttBoard[2][1] == 'O' && tttBoard[2][2] == 'O') || // row2
				(tttBoard[0][0] == 'O' && tttBoard[1][0] == 'O' && tttBoard[2][0] == 'O') || // col0
				(tttBoard[0][1] == 'O' && tttBoard[1][1] == 'O' && tttBoard[2][1] == 'O') || // col1
				(tttBoard[0][2] == 'O' && tttBoard[1][2] == 'O' && tttBoard[2][2] == 'O') || // col2
				(tttBoard[0][0] == 'O' && tttBoard[1][1] == 'O' && tttBoard[2][2] == 'O') || // mainDiag
				(tttBoard[0][2] == 'O' && tttBoard[1][1] == 'O' && tttBoard[2][0] == 'O')) {// lesserDiag
			comWin = true;
			draw = false;
			playerWin = false;
			done = true;
		}
		int count = 0;
		for (int i = 0; i < tttBoard.length; i++) {
			for (int j = 0; j < tttBoard[i].length; j++) {
				if (tttBoard[i][j] == ' ') {
					count++;
				}
			}
		}
		if (count == 0 && !playerWin && !comWin) {
			draw = true;
			done = true;
		}
		if (comWin) {
			System.out.print("you are bad at this");
			System.exit(0);
		} else if (playerWin) {
			System.out.print("congrats");
			System.exit(0);
		} else if (draw) {
			System.out.print("you are still bad at this");
			System.exit(0);
		}
	}

	public static void playerTurn() {
		System.out.println();
		String row = "";
		String col = "";
		do {
			while (!((row.equals("1") || row.equals("2") || row.equals("3")) && (col.equals("1") || col.equals("2")
					|| col.equals("3")))) {
				Scanner input = new Scanner(System.in);
				System.out.print("Enter your desired row number (1-3):");
				row = input.nextLine();
				System.out.print("Enter your desired col number (1-3):");
				col = input.nextLine();
			}
		} while (tttBoard[Integer.parseInt(row) - 1][Integer.parseInt(col) - 1] != ' ');
		tttBoard[Integer.parseInt(row) - 1][Integer.parseInt(col) - 1] = 'X';
	}

	public static void comTurn() {
		int row;
		int col;
		do{
			row = (int) (Math.random() * 3);
			col = (int) (Math.random() * 3);
		}while (!(tttBoard[row][col] == ' ')); 
		tttBoard[row][col] = 'O';
	}

	public static void printBoard() {
		for (int i = 0; i < tttBoard.length; i++) {
			for (int j = 0; j < tttBoard[i].length; j++) {
				if (j == 0) {
					System.out.print("\t\t\t\t\t");
				}
				if (j < 2) {
					System.out.print(" " + tttBoard[i][j] + " |");
				} else
					System.out.print(" " + tttBoard[i][j] + " ");
			}
			if (i < 2) {
				System.out.println();
				System.out.println("\t\t\t\t\t-----------");
			}
		}
		System.out.println("\n");
	}
}
