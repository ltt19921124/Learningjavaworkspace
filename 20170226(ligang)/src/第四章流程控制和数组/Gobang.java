package 第四章流程控制和数组;

import java.io.BufferedReader;

public class Gobang {
	
	private String[][] board;
	
	private static int BOARD_SIZE = 15;
	public void initBoard(){
		board = new String[BOARD_SIZE][BOARD_SIZE];
		for(int i=0;i<BOARD_SIZE;i++){
			for(int j=0;j<BOARD_SIZE;j++){
				board[i][j] = "+";
			}
		}
	}
	
	public void printBoard(){
		for(int i=0;i<BOARD_SIZE;i++){
			for(int j=0;j<BOARD_SIZE;j++){
				System.out.print(board[i][j]);
			}
			System.out.print("\n");
		}
	}
	
	

}







