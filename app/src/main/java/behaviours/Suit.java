package behaviours;

/**
 * Created by user on 23/06/2017.
 */

public enum Suit {
    HEARTS("Hearts"),
    DIAMONDS("Diamonds"),
    SPADES("Spades"),
    CLUBS("Clubs");

    private String suit;
    Suit(String suit){
        this.suit = suit;
    }

    public String getSuitType() {
        return this.suit;
    }

}
