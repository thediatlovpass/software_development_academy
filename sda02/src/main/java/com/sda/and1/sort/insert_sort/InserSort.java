package com.sda.and1.sort.insert_sort;

import java.util.Arrays;

public class InserSort {

    public static void main(String[] args) {

        Integer[] array = {8, 5, 4, 9, 2, 6};
        insertSort(array);
        System.out.println(Arrays.asList(array));
    }

    private static void insertSort(Integer[] array) {
        int pointer = 1;
        for(int i = 1; i < array.length; i++) {
            int val = array[i];
            for(int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
