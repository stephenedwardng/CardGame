package com.example.user.cardgame;
import java.util.ArrayList;

import behaviours.Card;

/**
 * Created by user on 22/06/2017.
 */

public class Game {

    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String playGame(){
        Card player1Card = player1.takeCard();
        Card player2Card = player2.takeCard();

        System.out.println(player1.getName() + " played " + player1Card);
        System.out.println(player2.getName() + " played " + player2Card);

        int winner = compareCards(player1Card, player2Card);

        return displayWinner(winner);
    }

    private int compareCards(Card player1Card, Card player2Card){
        if (player1Card == player2Card) {
            return 0;
        }

        return (findIndex(player1Card) > findIndex(player2Card) ? 1 : -1);
    }

    private int findIndex(Card card){
        ArrayList<Card> cards = new ArrayList<>();
        return cards.indexOf(card);

    }

    public String displayWinner(int result){
        switch (result){
            case 0:
                return "Draw";
            case 1:
                return player1.getName() + " wins";
            case -1:
                return player2.getName() + " wins";
        }
        return null;

    }

}
