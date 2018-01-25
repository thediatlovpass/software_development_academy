package com.sda.exercise1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Reads whole line from standard input
        String input = scanner.nextLine();
        // Split input string by "," sign
        String[] split = input.split(",");
        printArrElements(split);
    }

    private static void printArrElements(String[] array) {
        // Solution 1 - if statement
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println(array[i]);
            }
        }
        // Solution 2 - increment by 2
//        for (int i = 0; i < array.length; i+=2) {
//            System.out.println(array[i]);
//        }
        // Solution 3 - lambda expression
//        IntStream.range(0, array.length).filter(value -> value % 2 == 0).mapToObj(operand -> array[operand]).forEach(s -> System.out.println(s));
    }
}
