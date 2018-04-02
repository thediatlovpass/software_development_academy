package com.sda.and1.various.poker_hand;

import java.util.ArrayList;
import java.util.List;

public class PokerHand {
    private List<Card> cards = new ArrayList<>();

    public PokerHand(String hand) {
        String[] handSplited = hand.split(" ");
        for (int i = 0; i < handSplited.length; i++) {
            Color color = Color.getColor(Character.toString(handSplited[i].toCharArray()[1]));
            Figure figure = Figure.getFigure(Character.toString(handSplited[i].toCharArray()[0]));
            Card card = new Card(color, figure);
            cards.add(card);
        }
    }

    public int compare(PokerHand second) {
        int firstValue = HandRanking.getHandValue(this);
        System.out.println(firstValue);
        int secondValue = HandRanking.getHandValue(second);
        System.out.println(secondValue);
        int compare = Integer.compare(firstValue, secondValue);
        System.out.println(compare);
        return compare;
    }

    public List<Card> getCards() {
        return cards;
    }
}
