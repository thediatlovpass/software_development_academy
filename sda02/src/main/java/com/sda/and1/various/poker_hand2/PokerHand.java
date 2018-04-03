package com.sda.and1.various.poker_hand2;

import java.util.Arrays;

public class PokerHand {
    private Card first;
    private Card second;
    private Card third;
    private Card fourth;
    private Card fifth;


    public int compare(PokerHand hand) {
        boolean isEqualColorFirst = isColorEqual(this);
        boolean isEqualColorSecond = isColorEqual(hand);
        boolean isStraightFirst = isStraight(this);
        boolean isStraightSecond = isStraight(hand);
        int highestCardFirst = highestCard(this);
        int highestCardSecond = highestCard(hand);

        if (isEqualColorFirst && isEqualColorSecond) {
            if (isStraightFirst && isStraightSecond) {
                return Integer.compare(highestCardFirst, highestCardSecond);
            } else if (isStraightFirst) {
                return 1;
            } else if (isStraightSecond) {
                return -1;
            } else {
                compareOtherThanStraightAndFlush(hand);
            }
        }


        return 0;
    }

    private void compareOtherThanStraightAndFlush(PokerHand hand) {

    }

    private int highestCard(PokerHand hand) {
        int[] cardValues = {hand.first.getValue(), hand.second.getValue(),
                hand.third.getValue(), hand.fourth.getValue(), hand.fifth.getValue()};
        Arrays.sort(cardValues);
        return cardValues[0];
    }

    private boolean isStraight(PokerHand hand) {
        int[] cardValues = {hand.first.getValue(), hand.second.getValue(),
                hand.third.getValue(), hand.fourth.getValue(), hand.fifth.getValue()};
        Arrays.sort(cardValues);
        return cardValues[0] == cardValues[1] - 1 && cardValues[1] == cardValues[2] - 1
                && cardValues[2] == cardValues[3] - 1 && cardValues[3] == cardValues[4] - 1;
    }

    private boolean isColorEqual(PokerHand hand) {
        return hand.first.getColor().equals(hand.second.getColor())
                && hand.second.getColor().equals(hand.third.getColor())
                && hand.third.getColor().equals(hand.fourth.getColor())
                && hand.fifth.getColor().equals(hand.fourth.getColor());
    }

    public PokerHand(String hand) {
        String[] pokerHand = hand.split(" ");
        this.first = new Card(pokerHand[0]);
        this.second = new Card(pokerHand[1]);
        this.third = new Card(pokerHand[2]);
        this.fourth = new Card(pokerHand[3]);
        this.fifth = new Card(pokerHand[4]);
    }

    public Card getFirst() {
        return first;
    }

    public Card getSecond() {
        return second;
    }

    public Card getThird() {
        return third;
    }

    public Card getFourth() {
        return fourth;
    }

    public Card getFifth() {
        return fifth;
    }
}
