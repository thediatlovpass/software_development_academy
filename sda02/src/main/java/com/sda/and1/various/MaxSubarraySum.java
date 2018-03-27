package com.sda.and1.various;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSubarraySum {
    //    MaxSubarraySum.max(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
    //      returns "6: {4, -1, 2, 1}"
    public static void main(String[] args) {
        System.out.println(max(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    private static String max(int[] input) {

        List<Integer> resultArray = new ArrayList<>();
        int maxSum = Integer.MIN_VALUE;

        for (int j = 0; j < input.length; j++) {
            List<Integer> tmpArray = new ArrayList<>();
            int sum = input[j];
            tmpArray.add(sum);


            for (int i = j + 1; i < input.length; i++) {
                sum += input[i];
                tmpArray.add(input[i]);
                if (maxSum < sum) {
                    maxSum = sum;
                    resultArray = new ArrayList<>(tmpArray);
                }
            }
        }
        return resultArray.toString();
    }
}
