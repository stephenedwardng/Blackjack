package com.example.user.blackjack;

import behaviours.Rank;
import behaviours.Suit;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 23/06/2017.
 */

public class Deck {

    public Rank deal(){
        // Fill deck.
        Rank[] ranks = Rank.values();

        // return a random card from deck,
        Random random = new Random();
        int index = random.nextInt(ranks.length);

        // include remove from deck once you combine
        // Rank and Suit into Card

        return ranks[index];
    }

}
