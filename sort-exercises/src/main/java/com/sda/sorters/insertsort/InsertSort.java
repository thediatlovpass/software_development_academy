package com.sda.sorters.insertsort;

public class InsertSort {
    public static void main(String[] args) {
        Integer[] inputArray = {7, 3, 4, 8, 5, 9};
        sort(inputArray);
    }

    private static void sort(Integer[] array) {
        Integer pointer = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < pointer; j++) {
                if (array[j] > array[pointer]) {
                    Integer temp = array[pointer];
                    array[pointer] = array[j];
                    array[j] = temp;
                }
            }
            if (pointer < array.length - 1) {
                pointer++;
            }
        }
    }
}
