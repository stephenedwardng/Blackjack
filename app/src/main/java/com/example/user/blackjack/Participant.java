package com.example.user.blackjack;

import java.util.ArrayList;

/**
 * Created by user on 24/06/2017.
 */

public abstract class Participant {

    private String name;
    ArrayList<Card> hand = new ArrayList<>();
    Deck deck = new Deck();

    public Participant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void startingHand() {
        hand.add(deck.deal());
        hand.add(deck.deal());
    }

    public ArrayList<Card> currentHand() {
        return this.hand;
    }

    public void hit() {
        hand.add(deck.deal());
    }

    public int value() {
        int sum = 0;
        for(Card card : hand)
            sum += card.rankValue();
        return sum;
    }

    public String revealHand() {
        String message = "";
        for(Card card : hand)
            message += card.prettyName() + ". ";
        return message;
    }

}
