package com.example.user.blackjack;

import java.util.ArrayList;
import behaviours.Rank;
import behaviours.Suit;

/**
 * Created by user on 24/06/2017.
 */

public class Player {

    private String name;
    ArrayList<Card> hand = new ArrayList<>();
    Deck deck = new Deck();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public ArrayList<Card> startingHand() {
//        hand.add(deck.deal());
//        hand.add(deck.deal());
//        return hand;
//    }

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

}
