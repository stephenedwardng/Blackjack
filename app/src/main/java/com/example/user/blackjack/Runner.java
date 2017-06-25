package com.example.user.blackjack;

import behaviours.Rank;
import behaviours.Suit;
import behaviours.HitOrStand;
import java.util.Scanner;

/**
 * Created by user on 25/06/2017.
 */

public class Runner {

    public static void main(String[] args) {

        // New up a game
        Deck deck = new Deck();
        Dealer dealer = new Dealer("Lynne");
        Player player = new Player("Eddie");
        Game game = new Game(deck, player, dealer);

        // Welcome
        System.out.println(String.format("%s is playing %s the Dealer", player.getName(), dealer.getName()));
        System.out.println("Let's deal the first hand...");

        // Deal starting hands
        player.startingHand();
        dealer.startingHand();
        System.out.println(String.format("%s has %s with a value of %s", player.getName(), player.revealHand(), player.value()));
        System.out.println(String.format("%s has %s", dealer.getName(), dealer.revealOneCard()));
        game.checkForBlackjack();
        game.checkOverTwentyOne();

        char choice;

        do {
            System.out.println("Press H to HIT or S STAND: ");

            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine().toUpperCase();
            choice = input.charAt(0);

            if (game.hitOrStand(choice) == HitOrStand.HIT) {
                player.hit();
                if (!game.checkDealerThreshold()) dealer.hit();
            }

            game.checkForBlackjack();
            game.checkOverTwentyOne();

            System.out.println(String.format("%s has %s with a value of %s", player.getName(), player.revealHand(), player.value()));
            System.out.println(String.format("%s has %s", dealer.getName(), dealer.revealOneCard()));

        } while (game.hitOrStand(choice) == HitOrStand.HIT
                && dealer.value() < game.BLACKJACK
                && player.value() < game.BLACKJACK);

        System.out.println("Stand option begins ");



    }
}
