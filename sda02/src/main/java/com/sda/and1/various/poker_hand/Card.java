package com.sda.and1.various.poker_hand;

public class Card {
    private Color color;
    private Figure figure;

    public Card(Color color, Figure figure) {
        this.color = color;
        this.figure = figure;
    }

    public Color getColor() {
        return color;
    }

    public Figure getFigure() {
        return figure;
    }
}
