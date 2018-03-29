package com.sda.and1.various;

import java.util.Arrays;

public class CamelCase {
    // returns "theStealthWarrior"
//    toCamelCase("the-stealth-warrior")

    // returns "TheStealthWarrior"
//    toCamelCase("The_Stealth_Warrior")
    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
        System.out.println(toCamelCase("The_Stealth_Warrior"));
        System.out.println(toCamelCase("The Stealth Warrior"));
    }

    private static String toCamelCase(String input) {
        String[] sentence = input.split("_|-| ");
        String result ="";
        for (int i = 1; i < sentence.length; i++) {
            char[] temp = sentence[i].toCharArray();
            if (temp[0] >= 'a' && temp[0] <= 'z') {
                temp[0] -= 32;
            }
            sentence[i] = String.valueOf(temp);
        }
            for(String string : sentence){
                result+=string;
            }
          return result;
    }
}
