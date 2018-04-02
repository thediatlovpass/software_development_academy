package com.sda.and1.various.poker_hand;

public enum Color {
    SPADE("S"),
    HEART("H"),
    DIAMOND("D"),
    CLUB("C");

    private final String name;

    Color(String name) {
        this.name = name;
    }

    public static Color getColor(String name) {
        for (Color c : values()) {
            if (c.name.equals(name)) {
                return c;
            }
        }
        return null;
    }
}
