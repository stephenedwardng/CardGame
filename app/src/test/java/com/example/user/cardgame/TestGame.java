package com.example.user.cardgame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 22/06/2017.
 */

public class TestGame {

    Game game;
    Player player1;
    Player player2;

    @Before
    public void before(){
        player1 = new Player("Eddie");
        player2 = new Player("Lynne");
        game = new Game(player1, player2);
    }

    @Test
    public void canPlayGame(){
        assertEquals("Eddie wins", game.playGame());
    }


}
