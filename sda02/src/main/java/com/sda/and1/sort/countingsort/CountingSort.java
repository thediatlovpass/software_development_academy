package com.sda.and1.sort.countingsort;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] sort = {6, 4, 5, 7, 9, 1, 7, 6};

        sort(sort);


    }

    private static void sort(int[] sort) {
        int maxValue = sort[0];
        for (int i = 0; i < sort.length; i++) {
            if (sort[i] > maxValue) {
                maxValue = sort[i];
            }

        }
        int[] newarray = new int[maxValue + 1];
        for (int i = 0; i < sort.length; i++) {
            newarray[sort[i]]++;

        }

        for (int i = 1; i < newarray.length; i++) {
            newarray[i] += newarray[i - 1];

        }
        int[] result = new int[sort.length];
        for (int i = sort.length - 1; i >= 0; i--) {
            int index = newarray[sort[i]];
            result[index - 1] = sort[i];
            newarray[sort[i]]--;

        }
        System.out.println(Arrays.toString(result));
    }
}
