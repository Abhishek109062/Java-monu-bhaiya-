package Assignment4;

import java.util.*;
public class K_knight {
	static int count = 0;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean board[][] = new boolean[n][n];
		positions(board, n, 0, 0);
		System.out.println("\n" + count);
    }

	public static void positions(boolean[][] board, int n, int i, int j){
		if(n == 0){
			count++;
			display(board);
			return;
		}

		for(int x = i ; x < board.length; x++){
			for(int y = 0; y < board.length; y++){
				if(isSafe(board, i, j)){
					board[x][y] = true;
					positions(board, n-1, i, j+1);
					board[x][y] = false;
				}
			}
		}
	}

	public static boolean isSafe(boolean[][] board, int row, int col){
		if(row - 2 >= 0 && col - 1 >= 0 &&  board[row][col])
		return false;

		if(row - 1 >= 0 && col - 2 >= 0 &&  board[row][col])
		return false;

		if(row + 1 >= 0 && col + 2 >= 0 &&  board[row][col])
		return false;

		if(row + 2 >= 0 && col + 1 >= 0 &&  board[row][col])
		return false;

		return true;
	}

	public static void display(boolean[][] board){
		for(int x = 0; x < board.length; x++){
			for(int y = 0; y < board[0].length; y++){
				if(board[x][y])
				System.out.print("{" + x + "-" + y + "} ");
			}
		}
		System.out.print(" ");
	}
}

