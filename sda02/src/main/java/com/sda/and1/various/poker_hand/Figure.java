package com.sda.and1.various.poker_hand;

public enum Figure {
    EMPTY("-1", -1),
    TWO("2", 2),
    THREE("3", 3),
    FOUR("4", 4),
    FIVE("5", 5),
    SIX("6", 6),
    SEVEN("7", 7),
    EIGHT("8", 8),
    NINE("9", 9),
    TEN("T", 10),
    JACK("J", 11),
    QUEEN("Q", 12),
    KING("K", 13),
    ACE("A", 14);

    private final String name;
    private final int value;

    Figure(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public static Figure getFigure(String name) {
        for (Figure f : values()) {
            if (f.name.equals(name)) {
                return f;
            }
        }
        return null;
    }

    public int getValue() {
        return value;
    }

    public Figure getLowerCard(){
        for (Figure f : values()) {
            if (f.value == this.value - 1) {
                return f;
            }
        }
        return EMPTY;
    }
}
