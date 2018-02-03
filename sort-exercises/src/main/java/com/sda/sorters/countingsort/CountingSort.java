package com.sda.sorters.countingsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CountingSort {

    public static void main(String[] args) {
        Integer[] inputArray = {6, 3, 6, 1, 4, 9, 0, 1, 8, 2, 6, 4, 9, 3, 7, 5, 9, 2, 7, 3, 2, 4, 1, 8, 7, 0, 8, 5, 8, 3, 6, 2, 5, 3};
        countingSort(inputArray);
    }

    public static void countingSort(Integer[] inputArray) {

        int maxValue = Arrays.stream(inputArray).max((o1, o2) -> o1 > o2 ? 1 : o1 < o2 ? -1 : 0).get();

        Integer[] sumArray = new Integer[maxValue + 1];
        Arrays.fill(sumArray, 0);
        for (int i = 0; i < inputArray.length; i++) {
            Integer key = inputArray[i];
            sumArray[key]++;
        }
        for (int i = 1; i < sumArray.length; i++) {
            sumArray[i] += sumArray[i - 1];
        }
        Integer[] resultArray = new Integer[inputArray.length];
        for (int i = inputArray.length - 1; i >= 0; i--) {
            Integer key = inputArray[i];
            Integer newKey = sumArray[key]--;
            resultArray[newKey - 1] = key;
        }
        System.out.println(Arrays.asList(resultArray).toString());
    }
}
