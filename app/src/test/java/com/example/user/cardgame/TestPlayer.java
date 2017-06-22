package com.example.user.cardgame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by user on 22/06/2017.
 */

public class TestPlayer {

    Player player;

    @Before
    public void before(){
        player = new Player("Eddie");
    }

    @Test
    public void canGetName(){
        assertEquals("Eddie", player.getName());
    }
    @Test
    public void testTakeCard(){
        assertNotNull(player.takeCard());
    }

}
