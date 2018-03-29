package com.sda.and1.various;

import java.util.Arrays;

public class MorseCode {
    //MorseCode.decode(".... . -.--   .--- ..- -.. .")
    // "HEY JUDE"
    //MorseCode.encode("HEY JUDE")
    // ".... . -.--   .--- ..- -.. ."
    private static char[] signs = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
            ',', '.', '?'};

    private static String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--.."};

    public static void main(String[] args) {
        System.out.println(decode(".... . -.--  .--- ..- -.. ."));
        System.out.println(encode("HEY JUDE"));

    }

    public static String decode(String input) {
        String[] array = input.split(" ");
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < morse.length; i++) {
                if (morse[i].equals(array[j])) {
                    array[j] = String.valueOf(signs[i]);
                } else if (array[j].equals("")) {
                    array[j] = " ";
                    j++;
                }
            }
        }
        String.join("", array);
//        String result ="";
//        for (int i = 0; i < array.length; i++) {
//            result += array[i];
//        }
        return String.join("", array);
    }

    public static String encode(String input) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < signs.length; j++) {
                if (input.toLowerCase().charAt(i) == signs[j]) {
                    text.append(morse[j]).append(" ");
                }
            }
            if (input.charAt(i) == ' '){
                text.append(" ");
            }
        }

        return text.toString();
    }
}
