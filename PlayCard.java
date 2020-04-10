package com.company;

public class PlayCard {

    private int rank;
    private char suit;

    public PlayCard(int rank, char suit)
    {
        this.rank = rank;
        this.suit = suit;
    }
    public PlayCard()
    {
        this.rank = (int)(13 * Math.random());
        this.suit = (char)(Math.random() * 8 + 9824);
    }

    public int getRank() {
        return rank;
    }

    public char getSuit() {
        return suit;
    }

    @Override
    public boolean equals(Object other)
    {
        if(other instanceof PlayCard && this.rank == ((PlayCard) other).getRank() && this.suit == ((PlayCard) other).getSuit())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean hasSameRank(PlayCard other)
    {
        if (this.rank == other.getRank())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean hasSameSuit(PlayCard other)
    {
        if (this.suit == other.getSuit())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean hasGreaterRank(PlayCard other)
    {
        if (this.rank > other.getRank())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean hasLesserRank(PlayCard other)
    {
        if (this.rank < other.getRank())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isFaceCard()
    {
        if (this.getRank() == 10 || this.getRank() == 11 || this.getRank() == 12)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isRed()
    {
        if (this.getSuit() == '\u2661' || this.getSuit() == '\u2662'||this.getSuit() == '\u2665'||this.getSuit() == '\u2666')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isBlack()
    {
        if (this.getSuit() == '\u2664' || this.getSuit() == '\u2667' || this.getSuit() == '\u2660'|| this.getSuit() == '\u2663')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    @Override
    public String toString() {
        return "PlayCard " +
                " rank = " + rank +
                ", suit = " + suit;
    }
}
