package com.example.user.cardgame;
import java.util.Random;

import behaviours.Card;

/**
 * Created by user on 22/06/2017.
 */

public class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Card takeCard(){
        Card[] cards = Card.values();
        Random random = new Random();
        int index = random.nextInt(cards.length);
        return cards[index];
    }

}
