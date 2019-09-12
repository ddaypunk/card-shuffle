package me.delso.cardshuffle;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> deck = new ArrayList<>();

	Deck(){
		for (Suits suit : Suits.values()) {
			for(Faces face : Faces.values()){
				Card card = new Card.Builder()
					.withSuit(suit)
					.withFace(face)
					.build();

				deck.add(card);
			}
		}
	}

	public void shuffle(int times){
		System.out.println("\n\r");

		for (int i = 0; i < times; i++) {
			System.out.println(String.format("Shuffling %s...", i+1));
			Collections.shuffle(this.deck);
		}
	}

	public void printDeck() {
		for (Card card : this.deck) {
			String printable = String.format("%s of %s", card.getFace(), card.getSuit());
			System.out.println(printable);
		}
	}

	public enum Suits {
		HEARTS, DIAMONDS, CLUBS, SPADES;
	}

	public enum Faces {
		ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, KING, QUEEN;
	}
}
