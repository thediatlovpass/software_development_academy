package com.sda.and1.various.letters;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dictionary {
    private final List<String> words = new ArrayList<>();

    public Dictionary() {
        Scanner scan = new Scanner(getClass().getClassLoader().getResourceAsStream("slowa.txt"));
        while (scan.hasNextLine()) {
            words.add(scan.nextLine());
        }
    }

    public List<String> getWords() {
        return words;
    }
}
