package com.sda.and1.various;

import java.util.Arrays;

public class Snail {
    /*
        array = [[1,2,3],
                 [4,5,6],
                 [7,8,9]]
        snail(array) #=> [1,2,3,6,9,8,7,4,5]

        array = [[1,2,3],
                 [8,9,4],
                 [7,6,5]]
        snail(array) #=> [1,2,3,4,5,6,7,8,9]
     */

    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] arr2 = {
                {1, 2, 3},
                {8, 9, 4},
                {7, 6, 5}
        };

        System.out.println(Arrays.toString(snail(arr1)));
        System.out.println(Arrays.toString(snail(arr2)));

    }

    public static int[] snail (int[][] array) {
        int[] ints = new int[array.length * array[0].length];
        Integer[][] integers = new Integer[array.length][array[0].length];
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                integers[j][i] = array[j][i];
            }
        }

        int counter = 1;
        int index = 1;
        int horizontal = 0;
        int vertical = 0;
        ints[0] = integers[0][0];
        integers[0][0] = null;
        while (index < ints.length) {
            int answer = counter % 4;
            switch (answer) {
                case 1:
                    for (int i = horizontal + 1; i < integers[0].length; i++) { // prawo
                        if (integers[vertical][i] == null) break;
                        ints[index] = integers[vertical][i];
                        integers[vertical][i] = null;
                        index++;
                        if (horizontal < integers[0].length - 1)
                        horizontal++;
                    }
                    counter++;
                    break;
                case 2:
                    for (int i = vertical + 1; i < integers.length; i++) { // dol
                        if (integers[i][horizontal] == null) break;
                        ints[index] = integers[i][horizontal];
                        integers[i][horizontal] = null;
                        index++;
                        if (vertical < integers.length - 1)
                        vertical++;
                    }
                    counter++;
                    break;
                case 3:
                    for (int i = horizontal - 1; i >= 0; i--) { // lewo
                        if (integers[vertical][i] == null) break;
                        ints[index] = integers[vertical][i];
                        integers[vertical][i] = null;
                        index++;
                        if (horizontal > 0)
                        horizontal--;
                    }
                    counter++;
                    break;
                case 0:
                    for (int i = vertical - 1; i >= 0; i--) { // dol
                        if (integers[i][horizontal] == null) break;
                        ints[index] = integers[i][horizontal];
                        integers[i][horizontal] = null;
                        index++;
                        if (vertical > 0)
                        vertical--;
                    }
                    counter++;
                    break;
            }
        }
        return ints;
    }
}
