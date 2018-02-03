package com.sda.bubblesort;

import java.time.Duration;
import java.time.Instant;

public class BubbleSort {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6};
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void bubbleSort(Integer[] array) {
        Instant start = Instant.now();
        int size = array.length;
        for (int i = 0; i < size; i++) {
            boolean noStop = false;
            for (int j = 0; j < size - 1; j++) {
                if (array[j] > array[j + 1]) {
                    noStop = true;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            if (!noStop) {
                break;
            }
        }
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");
    }
}
