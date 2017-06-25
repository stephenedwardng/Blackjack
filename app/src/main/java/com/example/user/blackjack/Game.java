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

    public void checkOverTwentyOne() {
        if (player.value() > BLACKJACK) {
            displayWinner(-1);
        }
        else if (dealer.value() > BLACKJACK) {
            displayWinner(1);
        }
    }

    public void compareHands() {
        int result =  (player.value() > dealer.value() ? 1 : -1);
        displayWinner(result);
    }

    public String displayWinner(int result){
        String message = "";
        switch (result){
            case 1:
                message = player.getName() + " wins. ";
            case -1:
                message = dealer.getName() + " wins. ";
        }

        return message + player.getName() + " had " + player.revealHand() + ". " + dealer.getName() + " had " + dealer.revealHand();
    }
}
