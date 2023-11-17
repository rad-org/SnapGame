package org.example;

import org.example.model.Card;

import java.util.ArrayList;
import java.util.Collections;

public class CardAndDeck {
    public static boolean checkCard(Card a, Card b) {
        //Checks if same value
        if (a.getRank() == b.getRank()) {
            return true;
        }

        //Checks if it's a face value (K,Q,J)
        else if (a.getRank() == "Jack" || a.getRank() == "Queen" || a.getRank() == "King") {
            if (b.getRank() == "Jack" || b.getRank() == "Queen" || b.getRank() == "King") {
                return true;
            }
        }

        return false;
    }

    public ArrayList<Card> createDeck() {
        //Variables
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        ArrayList<Card> cards = new ArrayList<Card>();

        //Creates a deck of 52 unique cards
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                cards.add(new Card(suits[i], ranks[j]));
            }
        }

        //Randomises the deck
        Collections.shuffle(cards);
        return cards;
    }

}
