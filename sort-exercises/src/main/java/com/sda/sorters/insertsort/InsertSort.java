package com.sda.sorters.insertsort;

import com.sda.sorters.AbstractSort;

import java.util.Arrays;

public class InsertSort extends AbstractSort {
    public static void main(String[] args) {
//        Integer[] inputArray = {7, 3, 4, 8, 5, 9};
//        insertSort(inputArray, false);
        String[] inputArray = {"ca", "cd", "cb", "a", "cba", "cda", "acd"};
        insertSortString(inputArray);
    }

    public static void insertSortString(String[] array) {
        Integer pointer = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < pointer; j++) {
                char[] arrayJ = array[j].toCharArray();
                char[] arrayP = array[pointer].toCharArray();
                for (int k = 0; k < arrayJ.length && k < arrayP.length; k++) {
                    if (arrayJ[k] > arrayP[k]) {
                        swapString(array, pointer, j);
                        break;
                    }
                    if (arrayJ[k] < arrayP[k]) break;
                    if (arrayJ[k] == arrayP[k]) {
                        if (arrayP.length == k + 1) {
                            swapString(array, pointer, j);
                            break;
                        }
                    }
                }
            }
            if (pointer < array.length - 1) {
                pointer++;
            }
        }
    }

    private static void swapString(String[] array, Integer pointer, int j) {
        System.out.println(Arrays.asList(array).toString());
        System.out.println(array[pointer] + " <= " + array[j]);
        String temp = array[pointer];
        array[pointer] = array[j];
        array[j] = temp;
    }

    public static void insertSort(Integer[] array, boolean orderAsc) {
        Integer pointer = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < pointer; j++) {
                if (array[j] > array[pointer] && orderAsc) {
                    swap(array, pointer, j);
                } else if (array[j] < array[pointer] && !orderAsc) {
                    swap(array, pointer, j);
                }
            }
            if (pointer < array.length - 1) {
                pointer++;
            }
        }
    }

    private static void swap(Integer[] array, Integer pointer, int j) {
        Integer temp = array[pointer];
        array[pointer] = array[j];
        array[j] = temp;
    }

    @Override
    public void sortImpl(Integer[] array, boolean orderAsc) {
        insertSort(array, orderAsc);
    }
}
