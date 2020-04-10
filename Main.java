package com.company;

public class Main {

    public static void main(String[] args) {

		PlayCard Jack_of_Clubs = new PlayCard(10,'\u2667');
		PlayCard Ace_of_Hearts = new PlayCard(0,'\u2661');
		System.out.println(Jack_of_Clubs.equals(Ace_of_Hearts));
		System.out.println(Jack_of_Clubs.hasSameSuit(Ace_of_Hearts));
		System.out.println(Jack_of_Clubs.hasSameRank(Ace_of_Hearts));
		System.out.println(Jack_of_Clubs.hasGreaterRank(Ace_of_Hearts));
		System.out.println(Jack_of_Clubs.isFaceCard());
		Deck deck1 = new Deck();
		System.out.println(deck1.size());
		System.out.println(deck1.getCapacity());
		System.out.println(deck1);
		deck1.showOne(deck1.getTopCard());
		deck1.shuffle();
		System.out.println(deck1);
		deck1.showOne(deck1.getTopCard());
		deck1.takeOne(deck1.getTopCard());
		System.out.println(deck1);
		Deck deck2 = new Deck();
		System.out.println(deck1.isDeck(deck2));
		deck2.shuffle();
		System.out.println(deck2);
		PlayCard randomPlaycard = new PlayCard();
		System.out.println(randomPlaycard);
	}
}
