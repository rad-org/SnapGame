package org.example.model;

public class Card {
    //Variables
    private String suit;
    private String rank;

    //Constructor
    public Card(String suit, String rank) {
        setSuit(suit);
        setRank(rank);
    }

    //Getter functions
    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    //Setter functions
    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    //Makes it easy to print the card values
    public String toString() {
        return (rank + " of " + suit);
    }
}
