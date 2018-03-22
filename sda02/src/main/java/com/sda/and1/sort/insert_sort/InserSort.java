package com.sda.and1.sort.insert_sort;

import java.util.Arrays;

public class InserSort {

    public static void main(String[] args) {

//        Integer[] array = {8, 5, 4, 9, 2, 6};
//        insertSort(array);
        String[] inputArray = {"c", "cb", "ca", "a", "Bc", "bcaa", "abc", "ab"};
        insertSortString(inputArray);
        System.out.println(Arrays.asList(inputArray));
    }

    public static void insertSort(Integer[] array) {
        int pointer = 1;
        for (int i = 1; i < array.length; i++) {
            int val = array[i];
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void insertSortString(String[] array) {

        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                char[] chars = array[j].toLowerCase().toCharArray();
                char[] chars2 = array[j - 1].toLowerCase().toCharArray();
                int k = 0;
                do {
                    if (chars[k] < chars2[k]) {
                        String temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                        break;
                    } else if (chars[k] == chars2[k]) {
                        if (k == Math.min(chars.length, chars2.length) -1 && chars.length<chars2.length) {
                            String temp = array[j - 1];
                            array[j - 1] = array[j];
                            array[j] = temp;
                            break;
                        }
                        k++;
                    } else {
                        break;
                    }
                }
                while (k < Math.min(chars.length, chars2.length));

//                for (int k = 0; k < chars.length && k < chars2.length; k++) {
//
//                    if (chars[k] < chars2[k]) {
//                        String temp = array[j - 1];
//                        array[j - 1] = array[j];
//                        array[j] = temp;
//                        break;
//                    }
//                        if (chars.length < chars2.length) {
//                            String temp = array[j - 1];
//                            array[j - 1] = array[j];
//                            array[j] = temp;
//                        }
//                }
            }
        }
    }
}
