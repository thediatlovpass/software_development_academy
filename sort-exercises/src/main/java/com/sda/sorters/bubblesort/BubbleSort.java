package com.sda.sorters.bubblesort;

import com.sda.sorters.AbstractSort;

import java.time.Duration;
import java.time.Instant;

public class BubbleSort extends AbstractSort {

    public static void bubbleSort(Integer[] array, boolean orderAsc) {
        Instant start = Instant.now();
        int size = array.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (array[j] > array[j + 1] && orderAsc) {
                    swap(array, j);
                } else if (array[j] < array[j + 1] && !orderAsc) {
                    swap(array, j);
                }
            }
        }
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");
    }

    private static void swap(Integer[] array, int j) {
        int temp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = temp;
    }

    @Override
    public void sortImpl(Integer[] array, boolean orderAsc) {
        bubbleSort(array, orderAsc);
    }
}
