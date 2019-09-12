package me.delso.cardshuffle;

import static me.delso.cardshuffle.Deck.*;

class Card {
	private Suits suit;
	private Faces face;

	public static class Builder {
		private Suits suit;
		private Faces face;

		public Builder withSuit(Suits suit){
			this.suit = suit;
			return this;
		}

		public Builder withFace(Faces face){
			this.face = face;
			return this;
		}

		public Card build(){
			return new Card(this);
		}

	}

	private Card(Builder builder){
		suit = builder.suit;
		face = builder.face;
	}

	public Suits getSuit(){
		return this.suit;
	}

	public Faces getFace(){
		return this.face;
	}
}

