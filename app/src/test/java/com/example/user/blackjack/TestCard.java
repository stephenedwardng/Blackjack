package com.example.user.blackjack;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import behaviours.Rank;
import behaviours.Suit;

/**
 * Created by user on 24/06/2017.
 */

public class TestCard {

    Card card;

    @Before
    public void before(){
        card = new Card(Rank.ACE, Suit.SPADES);
    }

    @Test
    public void canGetRankValue(){
        assertEquals(11, card.rankValue());
    }

    @Test
    public void canGetSuit(){
        assertEquals("Spades", card.suitType());
    }

    @Test
    public void prettyName(){
        assertEquals("ACE of Spades", card.prettyName());
    }

}
