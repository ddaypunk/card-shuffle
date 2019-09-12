package me.delso.cardshuffle;

public class Main {

    public static void main(String[] args) {
	    Deck deck = new Deck();
	    System.out.println("\n\r<===== Un-shuffled =====>");
	    deck.printDeck();
	    deck.shuffle(100);
        System.out.println("\n\r<=====   Shuffled  ====>");
	    deck.printDeck();
    }
}
