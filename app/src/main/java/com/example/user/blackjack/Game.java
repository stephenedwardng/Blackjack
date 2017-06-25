package com.example.user.blackjack;

/**
 * Created by user on 25/06/2017.
 */

public class Game {

    Deck deck;
    Player player;
    Dealer dealer;
    int blackjack;

    public Game(Deck deck, Player player, Dealer dealer) {
        this.deck = deck;
        this.player = player;
        this.dealer = dealer;
        blackjack = 21;
    }

    public Deck getDeck() {
        return deck;
    }

    public Player getPlayer() {
        return player;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public boolean checkForBlackjack() {
        if (player.value() == blackjack
                || dealer.value() == blackjack)
        {
            return true;
        }
        else
            return false;
    }
}
