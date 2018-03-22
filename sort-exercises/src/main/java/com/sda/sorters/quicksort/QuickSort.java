package com.sda.sorters.quicksort;

import org.assertj.core.api.Assertions;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] inputArray = {7, 2, 5, 3, 4, 6, 2};
        int[] clone1 = inputArray.clone();
        quickSort(clone1, 0, inputArray.length);
        int[] clone2 = inputArray.clone();
        quickSort1(clone2, 0, inputArray.length - 1);
        Assertions.assertThat(clone1).isEqualTo(clone2);
    }

    private static void quickSort(int[] inputArray, int start, int end) {
        int lastIndex = end - 1;
        int pivot = (start + lastIndex) / 2;
        if (start >= end) {
            return;
        }
        int tempValue = inputArray[lastIndex];
        inputArray[lastIndex] = inputArray[pivot];
        inputArray[pivot] = tempValue;
        int j = start;
        for (int i = start; i < lastIndex; i++) {
            if (inputArray[i] < inputArray[lastIndex]) {
                int tempJ = inputArray[j];
                inputArray[j] = inputArray[i];
                inputArray[i] = tempJ;
                j++;
            }
        }
        int tempJ = inputArray[j];
        inputArray[j] = inputArray[lastIndex];
        inputArray[lastIndex] = tempJ;
        quickSort(inputArray, start, j);
        System.out.println();
        quickSort(inputArray, j + 1, end);
    }

    private static void quickSort1(int[] inputArray, int left, int right) {
        int i = (left + right) / 2;
        int pivot = inputArray[i];
        inputArray[i] = inputArray[right];
        int j = left;
        for (i = left; i < right; i++) {
            if (inputArray[i] < pivot) {
                int tempJ = inputArray[j];
                inputArray[j] = inputArray[i];
                inputArray[i] = tempJ;
                j++;
            }
        }
        inputArray[right] = inputArray[j];
        inputArray[j] = pivot;
        if (left < j - 1) {
            quickSort1(inputArray, left, j - 1);
        }
        if (j + 1 < right) {
            quickSort1(inputArray, j + 1, right);
        }
    }
}
