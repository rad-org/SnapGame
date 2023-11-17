package org.example;

import org.example.model.Card;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardAndDeckTest {


    @Test
    void testCheckSameRankCard() {
        Card a = new Card("Clubs", "3");
        Card b = new Card("Diamonds", "3");
        boolean check = CardAndDeck.checkCard(a, b);
        assertTrue(check);
    }

    @Test
    void testCheckDiffRankCard() {
        Card a = new Card("Clubs", "4");
        Card b = new Card("Diamonds", "3");
        boolean check = CardAndDeck.checkCard(a, b);
        assertFalse(check);
    }
    @Test
    void testCheckFaceValueCard() {
        Card a = new Card("Clubs", "Jack");
        Card b = new Card("Diamonds", "Queen");
        boolean check = CardAndDeck.checkCard(a, b);
        assertTrue(check);
    }
}