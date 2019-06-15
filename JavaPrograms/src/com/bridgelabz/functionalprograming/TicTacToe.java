/******************************************************************************
 * 
 *  
 *  Purpose: Play TicTacToe game 
 *
 *  @author   Nilesh Dahiphale
 *  @version 1.0
 *  @since   14-05-2019
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograming;

import com.bridgelabz.utilpackage.Utility;

public class TicTacToe
{
	
	public static final int PLAYER1 = 1, COMPUTER = -1;
	public static final int EMPTY = 0;
	
	public int player = PLAYER1;
	private int[][] board = new int[3][3];
	public boolean isEmpty = false;
	 /*
	  * The main function is written to test TicTacToe  class
	  */
	public static void main(String[] args) {
		TicTacToe t=new TicTacToe();
		int x=0,y=0;
		
		do {
			System.out.println(t.player==t.PLAYER1?"Player 1 turn":"COMPUTER 2 turn");
			System.out.println("Enter x and y places");
			x=Utility.getInteger();
			y=Utility.getInteger();
			
			t.putSign(x, y);
			System.out.println(t.toString());
			System.out.println("");
			t.displayWinner();
			
		}while(t.isEmpty);
		         

	}
	/**
	 * Function to put sign on matrix[2][2]
	 * @param x:number of rows.
	 * @param y:number of columns
	 */
	public void putSign(int x, int y)
	{
		if(x<0 || x>2 || y<0 || y>2)
		{
			System.out.println("Invalid board position");
			return;
		}
		if(board[x][y] != EMPTY)
		{
			System.out.println("Board position occupied");
			return;
		}
		board[x][y] = player;
		//if position player1 and computer
		if(board[x][y]==board[0][0]) {
			board[2][2]=-player;
		}else {
				board[y][x]= -player;
		}
		
	}
	/**
	 * Function to check is win conditions.
	 * @param player: who are playing. 
	 * @return win condition
	 */
	public boolean isWin(int player)
	{
		return ((board[0][0] + board[0][1] + board[0][2] == player*3) ||
				(board[1][0] + board[1][1] + board[1][2] == player*3) ||
				(board[2][0] + board[2][1] + board[2][2] == player*3) ||
				(board[0][0] + board[1][0] + board[2][0] == player*3) ||
				(board[0][1] + board[1][1] + board[2][1] == player*3) ||
				(board[0][2] + board[1][2] + board[2][2] == player*3) ||
				(board[0][0] + board[1][1] + board[2][2] == player*3) ||
				(board[2][0] + board[1][1] + board[0][2] == player*3));
	}
	
	/**
	 * Function to display the winner of game
	 */
	public void displayWinner()
	{
		if(isWin(PLAYER1))
		{
			System.out.println("\n PLAYER1 wins...!!");
			isEmpty=false;
		}
		else if(isWin(COMPUTER))
		{
			System.out.println("\n COMPUTER wins...!!");
			isEmpty=false;
		}
		else
		{
			if(!isEmpty)
			{
				System.out.println("GAME IS DROW");
			}
			
		}
	}
	/**
	 * Function to display board and signs of players.
	 */
	public String toString()
	{
		StringBuilder s = new StringBuilder();
		isEmpty = false;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				switch(board[i][j])
				{
				case PLAYER1: 
					s.append(" X ");
					break;
				case COMPUTER: 
					s.append(" O ");
					break;
				case EMPTY: 
					s.append("   ");
					isEmpty=true;
					break;
				}
				if(j<2)
				{
					s.append("|");
				}
				
			}
			if(i<2)
			{
				s.append("\n-----------\n");
			}
		}
		return s.toString();
	}
	
 }
