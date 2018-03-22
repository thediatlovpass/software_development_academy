package com.sda.and1.various;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] splitArray = inputString.split(",");
//        int[] inputArr = {0, 1, 2, 3, 4, 5, 6};
        int[] inputArr = new int[splitArray.length];
        for (int i = 0; i < splitArray.length; i++) {
            inputArr[i] = Integer.valueOf(splitArray[i]);
        }
        printOdd(inputArr);
    }

    private static void printOdd(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
