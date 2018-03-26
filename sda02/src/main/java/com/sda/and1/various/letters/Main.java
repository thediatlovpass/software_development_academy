package com.sda.and1.various.letters;

import java.util.List;

public class Main {
    // regex "^(?!.*?(.).*?\\1)[" + SLOWO + "]*[" + SLOWO + "]*$"
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        List<String> words = dictionary.getWords();
    }
}
