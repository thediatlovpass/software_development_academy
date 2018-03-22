package com.sda.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        List<String> words = dictionary.getWords();
        int v = (int) (Math.random() * 1000000 % words.size());
        String randomWord = words.get((int) Math.floor(v));
        List<String> collectedWords = words.stream()
                .filter(s -> s.matches("^(?!.*?(.).*?\\1)[" + randomWord + "]*[" + randomWord + "]*$"))
                .collect(Collectors.toList());
        List<String> finalWords = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            finalWords.add(collectedWords.get((int) Math.floor((Math.random() * 1000000 % collectedWords.size()))));
        }

        while (finalWords.size() > 0) {
            System.out.println(randomWord);
            for (int i = 0; i < finalWords.size(); i++) {
                char[] x = finalWords.get(i).toCharArray();
                for (int j = 0; j < x.length; j++)
                    System.out.print(" _ ");
                System.out.println();
            }
            System.out.println("> ");
            Scanner scanner = new Scanner(System.in);
            String nextLine = scanner.nextLine();
            if (finalWords.contains(nextLine)) {
                finalWords.remove(nextLine);
            }
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
