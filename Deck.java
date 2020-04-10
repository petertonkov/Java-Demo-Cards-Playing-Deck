package com.company;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Deck {
    private int j;
    private int capacity = 52;
    private PlayCard[] deck = new PlayCard[capacity];

    public Deck() {
        for (var index = 0; index <= 12; ++index) {
            this.deck[index] = new PlayCard(index, '\u2665');
        }
        /*
        Introduced a second variable j here because of the system of 12 ranks.
        If I use the array's index for the ranks, all the play cards would have a rank not defined in the
        PlayCard class.
         */
        for (var index = 13; index <= 25; ++index) {
                    this.deck[index] = new PlayCard(j, '\u2666');
                    j++;
        }
        j=0;
        for (var index = 26; index <= 38; ++index) {
            this.deck[index] = new PlayCard(j, '\u2660');
            j++;
        }
        j=0;
        for (var index = 39; index <= 51; ++index) {
                this.deck[index] = new PlayCard(j, '\u2663');
                j++;
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public PlayCard getTopCard()
    {
        return new PlayCard(deck[capacity-1].getRank(), deck[capacity-1].getSuit());
    }

    public int size() {
        return this.capacity;
    }

    public void showOne(PlayCard lastCard) {
        switch (lastCard.getRank())
        {
            case 0:
            {
                System.out.println("Ace of "+ lastCard.getSuit());
                break;
            }
            case 10:
            {
                System.out.println("Jack of "+ lastCard.getSuit());
                break;
            }
            case 11:
            {
                System.out.println("Queen of "+ lastCard.getSuit());
                break;
            }
            case 12:
            {
                System.out.println("King of "+ lastCard.getSuit());
                break;
            }
            default:
            {
                lastCard.toString();
                break;
            }
        }
    }
    public void takeOne(PlayCard topCard) {
        switch (topCard.getRank())
        {
            case 0:
            {
                System.out.println("Ace of "+ topCard.getSuit());
                deck = ArrayUtils.remove(deck,capacity-1);
                break;
            }
            case 10:
            {
                System.out.println("Jack of "+ topCard.getSuit());
                deck = ArrayUtils.remove(deck,capacity-1);
                break;
            }
            case 11:
            {
                System.out.println("Queen of "+ topCard.getSuit());
                deck = ArrayUtils.remove(deck,capacity-1);
                break;
            }
            case 12:
            {
                System.out.println("King of "+ topCard.getSuit());
                deck = ArrayUtils.remove(deck,capacity-1);
                break;
            }
            default:
            {
                topCard.toString();
                deck = ArrayUtils.remove(deck,capacity-1);
                break;
            }
        }
    }

    public void shuffle () {
        //Collections.shuffle(Arrays.asList(deck,RandomInt.get(0,50)));
//        for (var i=0;i<this.capacity;++i)
//        {
//            deck[i]= new PlayCard();
//        List<PlayCard> deckList = Arrays.asList(deck);
//        Collections.shuffle(deckList);
//        deckList.toArray(deck);
//        Collections.shuffle(Arrays.asList(deck));
//        Random rnd= ThreadLocalRandom.current();
//        for (var i=0;i<this.capacity;i++)
//        {
//            int index = rnd.nextInt(i+1);
//            Deck rndPlaycard = new Deck();
//            rndPlaycard=deck[index];
//            deck[index]= deck[i];
//            deck[i]=rndPlaycard;
        //return deck;
        List<PlayCard> temp = Arrays.asList(deck);
        Collections.shuffle(temp);
        temp.toArray(deck);
    }

    @Override
    public String toString() {
        return "deck = " + Arrays.toString(deck);
    }

    boolean isDeck (Object other)
    {
        if (other instanceof Deck && Arrays.equals(deck,((Deck) other).deck)) {
            return true;
        }
        else {
            return false;
        }
    }
}


