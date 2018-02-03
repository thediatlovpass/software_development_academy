package com.sda.heap;

import java.util.Arrays;
import java.util.stream.Collectors;

public class HeapSort {

    public static void main(String[] args){
        Integer[] inputArray = {1, 5, 7, 3, 7, 3, 9, 1, 4};
        sort(inputArray);
    }

    public static Integer[] sort(Integer[] array) {
        int currentSize = 0;
        for (int i = 0; i < array.length; i++) {
            Integer toInsert = array[i];
            int index = currentSize;
            currentSize++;
            int parentIndex = Math.floorDiv(index - 1, 2);
            while (index > 0 && array[parentIndex] < toInsert) {
                array[index] = array[parentIndex];
                index = parentIndex;
                parentIndex = Math.floorDiv(index - 1, 2);
            }
            array[index] = toInsert;
        }
        currentSize = array.length;
        for (int i = 0; i < array.length; i++) {
            Integer result = array[0];
            currentSize--;
            Integer value = array[currentSize];
            int index = 0;
            int sonIndex = 1;
            while (sonIndex < currentSize) {
                if (sonIndex + 1 < currentSize && array[sonIndex + 1] > array[sonIndex]) {
                    sonIndex++;
                }
                if (value >= array[sonIndex]) {
                    break;
                }
                array[index] = array[sonIndex];
                index = sonIndex;
                sonIndex = 2 * sonIndex + 1;
            }
            array[index] = value;
            array[array.length - 1 - i] = result;
        }
        return array;
    }
}
