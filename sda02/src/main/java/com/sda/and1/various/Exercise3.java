package com.sda.and1.various;

import java.util.HashMap;
import java.util.Map;

public class Exercise3 {
    public static void main(String[] args) {
        Integer[] inputArray = {1, 2, 2, 2, 1, 6, 2};
        printLeader(inputArray);
        Integer[] inputArray2 = {1, 2, 1, 6, 2};
        printLeader(inputArray2);
    }

    private static void printLeader(Integer[] array) {
        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            Integer key = array[i];
            Integer value = countMap.get(key);
            if (value != null) {
                value++;
                countMap.put(key, value);
            } else {
                countMap.put(key, 1);
            }
        }
        Integer leader = null;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() >= array.length / 2.0) {
                leader = entry.getKey();
            }
        }
        if (leader != null) {
            System.out.println(leader);
        } else {
            System.out.println(-1);
        }
    }
}
