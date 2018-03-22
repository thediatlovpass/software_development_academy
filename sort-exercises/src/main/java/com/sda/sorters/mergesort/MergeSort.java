package com.sda.sorters.mergesort;

public class MergeSort {
    public static void main(String[] args) {
        int[] inputArray = {7, 2, 5, 3, 4, 6, 2};
        mergeSort(inputArray, 0, inputArray.length - 1);
    }

    private static void mergeSort(int[] inputArray, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;
            mergeSort(inputArray, left, middle);
            mergeSort(inputArray, middle + 1, right);
            merge(inputArray, left, middle, right);
        }
    }

    private static void merge(int[] inputArray, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = inputArray[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = inputArray[middle + 1 + j];

        int i = 0, j = 0;

        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                inputArray[k] = L[i];
                i++;
            } else {
                inputArray[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            inputArray[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            inputArray[k] = R[j];
            j++;
            k++;
        }
    }
}
