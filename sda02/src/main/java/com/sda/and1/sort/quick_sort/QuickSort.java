package com.sda.and1.sort.quick_sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arrayToSort = {7,4,3,5,8,2,3};
        quickSort(arrayToSort, 0, arrayToSort.length -1);
        System.out.println(Arrays.toString(arrayToSort));
    }

    private static void quickSort(int[] arrayToSort, int left, int right) {
        int pivotIndex = (left + right) / 2;
        int pivot = arrayToSort[pivotIndex];
        arrayToSort[pivotIndex] = arrayToSort[right];
        int j = left;
        for (int i = left; i < right; i++) {
            if ( arrayToSort[i] < pivot){
                int tmp = arrayToSort[i];
                arrayToSort[i]= arrayToSort[j];
                arrayToSort[j] = tmp;
                j++;
            }
        }
        arrayToSort[right] = arrayToSort[j];
        arrayToSort[j] = pivot;
        if (left < j - 1){
            quickSort(arrayToSort, left, j -1);
        }
        if (j + 1 < right){
            quickSort(arrayToSort, j +1, right);
        }
    }
}
