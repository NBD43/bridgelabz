/******************************************************************************
 * 
 *  
 *  Purpose: To perform Deck of cards operation.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   31-05-2019
 *
 ******************************************************************************/package com.bridgelabz.oops;



public class DeckOfCardsTest {

	public static void main(String[] args) {
DeckOfCards deckOfCardsImpl=new DeckOfCards();
		
		String playercard[][] = deckOfCardsImpl.cardDistribute();
		//Arrays.sort(a);
		System.out.println("Player1 \t Player2 \t Player3 \t Player4");
		System.out.println();
		int x = 0;
		int y = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(playercard[x][y] + " \t ");
				y++;
				if (y == 9) {
					y = 0;
					x++;
				}
			}
			System.out.println();
		}

	}

}
