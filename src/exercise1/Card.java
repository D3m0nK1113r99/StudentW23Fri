package exercise1;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack = 11, Queen = 12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author dancye
 * @author Paul Bonenfant May 2020
 */
public class Card {

    public enum Suit {
        HEARTS,CLUBS,SPADES,DIAMONDS
    }
    
    public enum Value {
        ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,
        EIGHT,NINE,TEN,JACK,QUEEN,KING
    }
    
    //public static final String[] SUITS=
    //{"Hearts","Diamonds","Spades","Clubs"};
    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }
    
    private int value;
    private String suit;

    public int getValue() {
        return this.value;
    }

    /**
     * 
     * @param value
     */
    public void setValue(int value) {
        this.value = value;
    }

    public String getSuit() {
        return this.suit;
    }

    /**
     * 
     * @param suit
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

}
