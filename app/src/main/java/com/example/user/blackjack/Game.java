package com.example.user.blackjack;

import behaviours.HitOrStand;

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

    public void checkForBlackjack() {
        if (dealer.value() == BLACKJACK) {
            displayWinner(-1);
        }
        else if (player.value() == BLACKJACK) {
            displayWinner(1);
        }
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
        return 0;
    }

    public int compareHands() {
        return  (player.value() > dealer.value() ? 1 : -1);
    }

    public String displayWinner(int result){
        String message = "";
        switch (result){
            case 1:
                message = player.getName() + " wins";
                break;
            case -1:
                message = dealer.getName() + " wins";
        }

        return String.format("%s. %s had %s. %s had %s. Game over.", message, player.getName(),
                player.revealHand(), dealer.getName(), dealer.revealHand());
    }

    public HitOrStand hitOrStand(char choice) {
        switch(choice){
            case 'H' :
                return HitOrStand.HIT;
            case 'S' :
                return HitOrStand.STAND;
            default :
                return null;
        }
    }

}
