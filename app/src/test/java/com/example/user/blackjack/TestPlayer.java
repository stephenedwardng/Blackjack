package com.example.user.blackjack;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 24/06/2017.
 */

public class TestPlayer {

    Player player;
    Deck deck;

    @Before
    public void before() {
        player = new Player("Eddie");
        player.startingHand();
    }

    @Test
    public void canGetName() {
        assertEquals("Eddie", player.getName());
    }

//    @Test
//    public void canGetHand() {
//        assertNotNull(player.startingHand());
//    }

    @Test
    public void canFillHand(){
        assertEquals(2, player.hand.size());
    }

    @Test
    public void canHit(){
        player.hit();
        assertEquals(3, player.hand.size());
    }

}
