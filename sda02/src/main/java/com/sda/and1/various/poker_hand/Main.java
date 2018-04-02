package com.sda.and1.various.poker_hand;

public class Main {
    //PokerHand hand = new PokerHand("KS 2H 5C JD TD");
    //2, 3, 4, 5, 6, 7, 8, 9, T(en), J(ack), Q(ueen), K(ing), A(ce)
    //S(pades), H(earts), D(iamonds), C(lubs)
    //https://www.cardplayer.com/rules-of-poker/hand-rankings

    public static void main(String[] args) {
//        PokerHand royalFlush = new PokerHand("AD KD QD JD TD");
//        PokerHand straightFlush = new PokerHand("8D 7D 6D 5D 4D");
//        PokerHand fourOfKind = new PokerHand("8D 8S 8H 8C 4D");
//        PokerHand fullHouse = new PokerHand("8D 8S 8H 4C 4D");
//        PokerHand flush = new PokerHand("4S JS 8S 2S 9S");
//        PokerHand straight = new PokerHand("9D 8S 7H 6C 5D");
//        PokerHand threeOfKind = new PokerHand("8D 8S 8H 4C QD");
//        PokerHand twoPairs = new PokerHand("8D 8S 4H 4C AD");
//        PokerHand pair = new PokerHand("8D 8S 7H 5C AD");
//        PokerHand highCard = new PokerHand("KD 8S 7H 6C 4D");
//        PokerHand firstHand = new PokerHand("KS 2H 5C JD TD");
//        PokerHand secondHand = new PokerHand("KS KH 5C JD TD");
        PokerHand thirdHand = new PokerHand("KS KH QC QD TD");
        PokerHand fourthHand = new PokerHand("AS AH JC JD TD");
        thirdHand.compare(fourthHand);
    }
}
