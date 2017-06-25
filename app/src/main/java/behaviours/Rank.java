package behaviours;

/**
 * Created by user on 23/06/2017.
 */

public enum Rank {
    ACE("Ace", 11),
    KING("King",10),
    QUEEN("Queen", 10),
    JACK("Jack", 10),
    TEN("Ten", 10),
    NINE("Nine", 9),
    EIGHT("Eight", 8),
    SEVEN("Seven", 7),
    SIX("Six", 6),
    FIVE("Five", 5),
    FOUR("Four", 4),
    THREE("Three", 3),
    TWO("Two", 2);

    private String rankType;
    private int value;
    Rank(String rankType, int value){
        this.rankType = rankType;
        this.value = value;
    }

    public String getRankType() {
        return this.rankType;
    }

    public int getValue() {
        return this.value;
    }
}
