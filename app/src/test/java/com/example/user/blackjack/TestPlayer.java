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
    }

    @Test
    public void canGetName() {
        assertEquals("Eddie", player.getName());
    }

    @Test
    public void canGetHand() {
        assertNotNull(player.startingHand());
    }

    @Test
    public void canFillHand(){
        assertEquals(2, player.startingHand().size());
    }

//    @Test
//    public void canGetPrettyHand() {
//        player.getHand();
//        assertEquals("QUEEN of Diamonds", player.prettyHand());
//
//    }

//    @Test
//    public void canTakeCard() {
//        assertNotNull(player.takeCard());
//    }

//    @Test
//    public void canGetCardName() {
//
//    }
}
