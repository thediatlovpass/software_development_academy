package com.sda.and1.various.poker_hand;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class RankingFunction {

    public static Integer royalFlushFunction(PokerHand hand) {
        Map<Color, List<Card>> byColor = hand.getCards().stream().collect(groupingBy(Card::getColor));
        return byColor.size() == 1
                && containsCard(hand, Figure.ACE)
                && containsCard(hand, Figure.KING)
                && containsCard(hand, Figure.QUEEN)
                && containsCard(hand, Figure.JACK)
                && containsCard(hand, Figure.TEN)
                ? 100000 : 0;
    }

    private static boolean containsCard(PokerHand hand, Figure figure) {
        return hand.getCards().stream().anyMatch(card -> card.getFigure().equals(figure));
    }

    public static Integer straightFlushFunction(PokerHand hand) {
        Map<Color, List<Card>> byColor = hand.getCards().stream().collect(groupingBy(Card::getColor));
        if (byColor.size() == 1) {
            Figure highestFigure = getHighestFigure(hand);
            return containsCard(hand, highestFigure.getLowerCard())
                    && containsCard(hand, highestFigure.getLowerCard().getLowerCard())
                    && containsCard(hand, highestFigure.getLowerCard().getLowerCard().getLowerCard())
                    && containsCard(hand, highestFigure.getLowerCard().getLowerCard().getLowerCard().getLowerCard())
                    ? 90000 + highestFigure.getValue() : 0;
        }
        return 0;
    }

    public static Integer fourOfKind(PokerHand hand) {
        Map<Figure, List<Card>> byFigure = hand.getCards().stream().collect(groupingBy(Card::getFigure));
        Map.Entry<Figure, List<Card>> card = byFigure.entrySet().stream()
                .filter(figureListEntry -> figureListEntry.getValue().size() == 4).findFirst().orElse(null);
        return card != null ? 80000 + card.getKey().getValue() : 0;
    }

    public static Integer fullHouse(PokerHand hand) {
        Map<Figure, List<Card>> byFigure = hand.getCards().stream().collect(groupingBy(Card::getFigure));
        if (byFigure.size() == 2) {
            Figure highestFigure = getHighestFigure(hand);
            Figure lowerFigure = hand.getCards().stream()
                    .filter(card -> !card.getFigure().equals(highestFigure)).findAny().get().getFigure();
            return 70000 + highestFigure.getValue() * 100 + lowerFigure.getValue();
        }
        return 0;
    }

    public static Integer flush(PokerHand hand) {
        Map<Color, List<Card>> byColor = hand.getCards().stream().collect(groupingBy(Card::getColor));
        if (byColor.size() == 1) {
            Figure highestFigure = getHighestFigure(hand);
            return 60000 + highestFigure.getValue();
        }
        return 0;
    }

    public static Integer straight(PokerHand hand) {
        Figure highestFigure = getHighestFigure(hand);
        return containsCard(hand, highestFigure.getLowerCard())
                && containsCard(hand, highestFigure.getLowerCard().getLowerCard())
                && containsCard(hand, highestFigure.getLowerCard().getLowerCard().getLowerCard())
                && containsCard(hand, highestFigure.getLowerCard().getLowerCard().getLowerCard().getLowerCard())
                ? 50000 + highestFigure.getValue() : 0;
    }

    public static Integer threeOfKind(PokerHand hand) {
        Map<Figure, List<Card>> byFigure = hand.getCards().stream().collect(groupingBy(Card::getFigure));
        Map.Entry<Figure, List<Card>> card = byFigure.entrySet().stream()
                .filter(figureListEntry -> figureListEntry.getValue().size() == 3).findFirst().orElse(null);
        return card != null ? 40000 + card.getKey().getValue() : 0;
    }

    public static Integer twoPairs(PokerHand hand) {
        Map<Figure, List<Card>> byFigure = hand.getCards().stream().collect(groupingBy(Card::getFigure));
        List<Map.Entry<Figure, List<Card>>> pairs = byFigure.entrySet().stream()
                .filter(figureListEntry -> figureListEntry.getValue().size() == 2).collect(Collectors.toList());
        if (pairs.size() == 2) {
            Figure highestFigure = hand.getCards().stream()
                    .filter(card -> !card.getFigure().equals(pairs.get(0).getKey()) && !card.getFigure().equals(pairs.get(1).getKey()))
                    .collect(Collectors.toList())
                    .stream()
                    .max(Comparator.comparingInt(card -> card.getFigure().getValue())).get().getFigure();
            if (pairs.get(0).getKey().getValue() > pairs.get(1).getKey().getValue()) {
                return 30000 + pairs.get(0).getKey().getValue() * 100 + pairs.get(1).getKey().getValue() * 10 + highestFigure.getValue();
            } else {
                return 30000 + pairs.get(1).getKey().getValue() * 100 + pairs.get(0).getKey().getValue() * 10 + highestFigure.getValue();
            }
        }
        return 0;
    }

    public static Integer onePair(PokerHand hand) {
        Map<Figure, List<Card>> byFigure = hand.getCards().stream().collect(groupingBy(Card::getFigure));
        Map.Entry<Figure, List<Card>> pair = byFigure.entrySet().stream()
                .filter(figureListEntry -> figureListEntry.getValue().size() == 2).findAny().orElse(null);
        if (pair != null) {
            Figure highestFigure = hand.getCards().stream()
                    .filter(card -> !card.getFigure().equals(pair.getKey())).collect(Collectors.toList())
                    .stream()
                    .max(Comparator.comparingInt(card -> card.getFigure().getValue())).get().getFigure();
            return 20000 + pair.getKey().getValue() * 100 + highestFigure.getValue();
        }
        return 0;
    }

    public static Integer highestCard(PokerHand hand) {
        Figure highestFigure = getHighestFigure(hand);
        return 10000 + highestFigure.getValue();
    }

    private static Figure getHighestFigure(PokerHand hand) {
        return hand.getCards().stream()
                .max(Comparator.comparingInt(card -> card.getFigure().getValue())).get().getFigure();
    }
}
