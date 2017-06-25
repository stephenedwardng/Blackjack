package com.example.user.blackjack;

/**
 * Created by user on 25/06/2017.
 */

public class Game {

    Deck deck;
    Player player;
    Dealer dealer;
    final int BLACKJACK;

    public Game(Deck deck, Player player, Dealer dealer) {
        this.deck = deck;
        this.player = player;
        this.dealer = dealer;
        BLACKJACK = 21;
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
        if (player.value() == BLACKJACK
                || dealer.value() == BLACKJACK) {
            return true;
        }
        else
            return false;
    }

    public boolean checkDealerThreshold() {
        if (dealer.value() < dealer.getThreshold()) {
            return true;
        }
        else
            return false;
    }

    public int checkOverTwentyOne() {
        if (player.value() > BLACKJACK) {
            return -1;
        }
        else if (dealer.value() > BLACKJACK) {
            return 1;
        }
        else return 0;
    }
}
