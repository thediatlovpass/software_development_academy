package com.sda.and1.various;

import org.assertj.core.api.Assertions;

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
        Assertions.assertThat(count("dogcat")).isEqualTo(2); // =2("dog" and "cat")
        Assertions.assertThat(count("bcaatt")).isEqualTo(2); // =2("bat" and "cat")
        Assertions.assertThat(count("dogdog")).isEqualTo(2); // =2("dog" and "dog")
        Assertions.assertThat(count("dopig")).isEqualTo(1); // =1(only contains one of "dog" or "pig")
        Assertions.assertThat(count("goatcode")).isEqualTo(2); // =2  should return 2("dog","cat"), not 1("goat")
        Assertions.assertThat(count("cockdogwdufrbir")).isEqualTo(4); // =4  should return 4("cow","duck","frog","bird") not 2("cock" and "dog")
    }

    private static int count(String input) {
        return 0;
    }
}
