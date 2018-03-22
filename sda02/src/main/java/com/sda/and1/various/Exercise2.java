package com.sda.and1.various;

public class Exercise2 {
    public static void main(String[] args) {
        int[] inputArray = {1, 4, 78, 3};
        printMinMax(inputArray);
    }

    private static void printMinMax(int[] array) {
        int min = array[0];
        int minIndex = 0;
        int max = array[0];
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max){
                maxIndex = i;
                max = array[i];
            }
            if(array[i] < min){
                minIndex = i;
                min = array[i];
            }
        }
        System.out.println("Min: " + minIndex + " (" + min + ")");
        System.out.println("Max: " + maxIndex + " (" + max + ")");
    }
}
