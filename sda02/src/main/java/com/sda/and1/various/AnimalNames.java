package com.sda.and1.various;

import org.assertj.core.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalNames {
    /*
    Give you some ```chars```, and they can combine many animal names.
    Return the maximum number of animal names that can be combined by chars.
    Animal names have been preload by variable ```names```
    One char can not use twice, for example:
    chars="goatcode"
    When you got a "dog" first time, chars left "atcoe",
    second time you can got a "cat".
    result=2
    When you got a "goat" first time, chars left "code",
    no animals will be found at next time.
    result=1
    So we should return the maximum number, sc("goatcode")=2
     */
    private static String[] animalNames = {"dog", "cat", "bat", "cock", "cow", "pig", "fox",
            "ant", "bird", "lion", "wolf", "deer", "bear", "frog",
            "hen", "mole", "duck", "goat"};

    public static void main(String[] args) {
//        Assertions.assertThat(count("dogcat")).isEqualTo(2); // =2("dog" and "cat")
        Assertions.assertThat(count("bcaatt")).isEqualTo(2); // =2("bat" and "cat")
        Assertions.assertThat(count("dogdog")).isEqualTo(2); // =2("dog" and "dog")
        Assertions.assertThat(count("dopig")).isEqualTo(1); // =1(only contains one of "dog" or "pig")
        Assertions.assertThat(count("goatcode")).isEqualTo(2); // =2  should return 2("dog","cat"), not 1("goat")
        Assertions.assertThat(count("cockdogwdufrbir")).isEqualTo(4); // =4  should return 4("cow","duck","frog","bird") not 2("cock" and "dog")
    }

    private static int count(String input) {
        List<String> contains = contains(input);
        return 0;
    }

    private static char[] nameToCharArray(String word){
        char[] chars = word.toCharArray();
        return chars;
    }

    private static List<String> contains(String input){
        List<String> animalsFound = new ArrayList<>();
        for (int i = 0; i < animalNames.length; i++) {
            List<Character> characterList = animalNames[i].chars()
                    .mapToObj(value -> ((char) value)).collect(Collectors.toList());
            for (int j = 0; j < characterList.size(); j++) {
                if (!input.contains(String.valueOf(characterList.get(j)))) {
                    break;
                } else if(j == characterList.size() - 1){
                    animalsFound.add(animalNames[i]);
                }
            }
        }

        return animalsFound;
    }
}
