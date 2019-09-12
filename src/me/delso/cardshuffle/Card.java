package me.delso.cardshuffle;

import static me.delso.cardshuffle.Deck.*;

class Card {
	private Suits suit;
	private Faces face;

	static class Builder {
		private Suits suit;
		private Faces face;

		Builder withSuit(Suits suit){
			this.suit = suit;
			return this;
		}

		Builder withFace(Faces face){
			this.face = face;
			return this;
		}

		Card build(){
			return new Card(this);
		}

	}

	private Card(Builder builder){
		suit = builder.suit;
		face = builder.face;
	}

	Suits getSuit(){
		return this.suit;
	}

	Faces getFace(){
		return this.face;
	}
}

