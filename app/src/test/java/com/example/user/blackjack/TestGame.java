package com.example.user.blackjack;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 25/06/2017.
 */

public class TestGame {

    Game game;
    Deck deck;
    Player player;
    Dealer dealer;

    @Before
    public void before() {
        deck = new Deck();
        dealer = new Dealer("Lynne");
        dealer.startingHand();
        player = new Player("Eddie");
        player.startingHand();
        game = new Game(deck, player, dealer);
    }

//    @Test
//    public void canCheckForBlackJack() {
//        assertEquals(false, game.checkForBlackjack());
//    }
//
//    @Test
//    public void canCheckDealerThreshold() {
//        assertEquals(true, game.checkDealerThreshold());
//    }

    @Test
    public void canCheckOverTwentyOne() {
        assertEquals(1, game.checkOverTwentyOne());
    }

}
