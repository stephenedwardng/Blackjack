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

    @Test
    public void canFillHand(){
        assertEquals(2, player.hand.size());
    }

    @Test
    public void canHit(){
        player.hit();
        assertEquals(3, player.hand.size());
    }

//    // Mockito not installing. Manual tests satisfactory
//    @Test
//    public void canRevealHand() {
//        assertEquals("Ace of Spades. Queen of Hearts.", player.revealHand());
//    }
//
//    // Mockito not installing. Manual tests satisfactory
//    @Test
//    public void value() {
//        assertEquals(10, player.value());
//    }

}
