package com.example.user.blackjack;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import behaviours.Rank;
import behaviours.Suit;

/**
 * Created by user on 24/06/2017.
 */

public class TestDeck {

    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void testDeal(){
        assertNotNull(deck.deal());
    }



}
