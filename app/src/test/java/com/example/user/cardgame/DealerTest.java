package com.example.user.cardgame;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 22/06/2017.
 */

public class DealerTest {

    Dealer dealer;

    @Before
    public void before(){
        dealer = new Dealer();
    }

    @Test
    public void testDealCard(){
        assertNotNull(dealer.dealCard());
    }

}
