package com.sda.and1.various.poker_hand;

import java.util.Arrays;
import java.util.function.Function;

public enum HandRanking {
    ROYAL_FLUSH(RankingFunction::royalFlushFunction),
    STRAIGHT_FLUSH(RankingFunction::straightFlushFunction),
    FOUR_OF_KIND(RankingFunction::fourOfKind),
    FULL_HOUSE(RankingFunction::fullHouse),
    FLUSH(RankingFunction::flush),
    STRAIGHT(RankingFunction::straight),
    THREE_OF_KIND(RankingFunction::threeOfKind),
    TWO_PAIRS(RankingFunction::twoPairs),
    ONE_PAIR(RankingFunction::onePair),
    HIGHEST_CARD(RankingFunction::highestCard);

    private final Function<PokerHand, Integer> function;

    HandRanking(Function<PokerHand, Integer> function) {
        this.function = function;
    }

    public Function<PokerHand, Integer> getFunction() {
        return function;
    }

    public static int getHandValue(PokerHand hand) {
        return Arrays.stream(HandRanking.values())
                .mapToInt(ranking -> ranking.getFunction().apply(hand))
                .max()
                .getAsInt();
    }
}
