package com.sda.sorters.insertsort;

import com.sda.sorters.AbstractSort;

public class InsertSort extends AbstractSort {
    public static void main(String[] args) {
        Integer[] inputArray = {7, 3, 4, 8, 5, 9};
        insertSort(inputArray, false);
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
