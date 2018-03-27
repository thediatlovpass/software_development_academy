package com.sda.and1.various.letters;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    // regex "^(?!.*?(.).*?\\1)[" + SLOWO + "]*[" + SLOWO + "]*$"
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        List<String> words = dictionary.getWords();

        List<String> filterWord = words.stream().filter(s -> s.length() >= 5).collect(Collectors.toList());
        Random random=new Random();
        String randomWord=filterWord.get(random.nextInt(filterWord.size()));



    }
}
