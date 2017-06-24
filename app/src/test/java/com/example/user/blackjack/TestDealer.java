package com.example.user.blackjack;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 24/06/2017.
 */

public class TestDealer {

    Dealer dealer;
    Deck deck;

    @Before
    public void before() {
        dealer = new Dealer("Lynne");
        dealer.startingHand();
    }

    @Test
    public void checkThreshold() {
        assertEquals(17, dealer.getThreshold());
    }

    @Test
    public void canGetName() {
        assertEquals("Lynne", dealer.getName());
    }

    @Test
    public void canFillHand(){
        assertEquals(2, dealer.hand.size());
    }

    @Test
    public void canHit(){
        dealer.hit();
        assertEquals(3, dealer.hand.size());
    }

}
