package com.example.user.blackjack;

import java.util.ArrayList;

/**
 * Created by user on 24/06/2017.
 */

public class Dealer extends Participant {

    private final int THRESHOLD;

    public Dealer(String name) {
        super(name);
        this.THRESHOLD = 17;
    }

    public int getThreshold() {
        return THRESHOLD;
    }

    public String revealOneCard() {
        return hand.get(0).prettyName();
    }
}
