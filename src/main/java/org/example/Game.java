package org.example;

import org.example.model.Card;

import java.util.ArrayList;

public class Game {
    public static void main(String[] args) {

        CardAndDeck cardAndDeck = new CardAndDeck();
        //Variables
        ArrayList<Card> Card = cardAndDeck.createDeck();
        ArrayList<Card> player1 = new ArrayList<Card>();
        ArrayList<Card> player2 = new ArrayList<Card>();
        int gameCounter = 0;
        //Splits the deck evenly between both players
        for (Card card : Card) {
            if (gameCounter < 26) {
                player1.add(card);
                gameCounter++;
            } else {
                player2.add(card);
            }
        }
        //Main game, keeps comparing Card until match found or no more Card
        boolean end = isGameOver(player1, player2, cardAndDeck);
        //Prints draw message if no matches found
        if (end == false) {
            System.out.println("Game over! It's a draw!");
        }
    }

    private static boolean isGameOver(ArrayList<Card> player1, ArrayList<Card> player2, CardAndDeck cardAndDeck) {
        boolean check;
        boolean end = false;
        int gameCounter = 0;
        Card temp = player2.get(gameCounter);
        while (end == false) {
            //Compares first 2 Card as base
            System.out.println("Player 1: " + player1.get(gameCounter));
            System.out.println("Player 2: " + player2.get(gameCounter));
            check = cardAndDeck.checkCard(player1.get(gameCounter), player2.get(gameCounter));

            //If first two Card match, it ends the game there
            if (check == true) {
                System.out.println("Snap!");
                gameCounter = 2222;
                end = true;
            }
            gameCounter++;

            //While loop keeps comparing Card after first 2
            while (gameCounter < player2.size()) {
                //If player1 matches previous player2 card it ends
                System.out.println("Player 1: " + player1.get(gameCounter));
                check = cardAndDeck.checkCard(player1.get(gameCounter), temp);
                if (check == true) {
                    System.out.println("Snap!");
                    gameCounter = 2222;
                    end = true;
                }
                //Checks if player2 matches previous player1 card
                else {
                    temp = player1.get(gameCounter);
                    System.out.println("Player 2: " + player2.get(gameCounter));
                    check = cardAndDeck.checkCard(player2.get(gameCounter), temp);
                    //If true, it ends the game
                    if (check == true) {
                        System.out.println("Snap!");
                        gameCounter = 2222;
                        end = true;
                    }
                    //If not, it keeps the game running
                    else {
                        temp = player2.get(gameCounter);
                        gameCounter++;
                    }
                }
            }
        }
        return end;
    }

}
