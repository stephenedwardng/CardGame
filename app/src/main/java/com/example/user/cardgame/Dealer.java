package com.example.user.cardgame;

import java.util.Random;

import behaviours.Card;
/**
 * Created by user on 22/06/2017.
 */

public class Dealer {

    public Card dealCard(){
        Card[] cards = Card.values();
        Random random = new Random();
        int index = random.nextInt(cards.length);
        return cards[index];
    }

}
