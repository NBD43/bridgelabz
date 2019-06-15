/******************************************************************************
 * 
 *  
 *  Purpose: To perform Deck of Cards after suffling cards.
 *
 *  @author  Nilesh Dahiphale
 *  @version 1.0
 *  @since   02-06-2019
 *
 ******************************************************************************/package com.bridgelabz.oops.deckofcards;

public class Main {
	public static void main(String args[]) {
		Deck deck = new Deck();
		System.out.println(deck);
		System.out.println("Size of deck is: " + deck.getSizeOfDeck());

		//Iterator<Deck> iteratorDeck=deck.iterator();
		System.out.println("player1 Deck after shuffling is " + deck);
		deck.shuffle();
		System.out.println("player2 Deck after shuffling is " + deck);
		deck.shuffle();
		System.out.println("player3 Deck after shuffling is " + deck);
		deck.shuffle();
		System.out.println("player4 Deck after shuffling is " + deck);
		

	}
}