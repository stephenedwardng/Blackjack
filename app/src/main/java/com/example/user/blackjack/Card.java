package com.example.user.blackjack;

import behaviours.Rank;
import behaviours.Suit;


/**
 * Created by user on 23/06/2017.
 */

public class Card {

    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return this.rank;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public String suitType() {
        return this.suit.getSuitType();
    }

    public int rankValue() {
        return this.rank.getValue();
    }

    public String prettyName() {
        return getRank() + " of " + suitType();
    }

}
