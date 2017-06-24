package com.example.user.blackjack;

import behaviours.Rank;
import behaviours.Suit;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 23/06/2017.
 */

public class Deck {

    public Card deal(){

        Rank[] ranks = Rank.values();
        Random random = new Random();
        int index = random.nextInt(ranks.length);
        Rank rank = ranks[index];

        Suit[] suits = Suit.values();
        Random randomSuit = new Random();
        int indexSuit = randomSuit.nextInt(suits.length);
        Suit suit = suits[indexSuit];

        Card card = new Card(rank, suit);

        return card;
    }

}
