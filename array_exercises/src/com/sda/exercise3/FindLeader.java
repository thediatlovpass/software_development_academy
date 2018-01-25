package com.sda.exercise3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindLeader {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 2, 2, 1, 6, 2};
        Integer[] arrError = {1, 2, 1, 6, 2};
        findLeader(arr);
        findLeader(arrError);
    }

    private static void findLeader(Integer[] array) {
        // Map for counting occurrences
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            // Map key -> value from input array
            Integer key = array[i];
            // Map value -> occurrences number
            Integer count = map.get(key);
            if (count == null) {
                // if null put new occurrence with count 1
                map.put(key, 1);
            } else {
                // if not null increment occurrences and replace in map (put works the same in this situation)
                // https://stackoverflow.com/a/35297640
                count++;
                map.replace(key, count);
            }
        }
        Integer leader = 0;
        Integer maxCount = 0;
        // Iterator enables you to cycle through a collection, obtaining or removing elements
        // https://docs.oracle.com/javase/7/docs/api/java/util/Iterator.html
        // Take map iterator
        Iterator it = map.entrySet().iterator();
        // Loop till iterator has next element
        while (it.hasNext()) {
            // Take map next entry -> map entry consists of key and value
            Map.Entry pair = (Map.Entry) it.next();
            // Check if map value (occurrences number) is greater than current maximum
            if ((Integer) pair.getValue() > maxCount) {
                // if true swap current maxCount and leader
                maxCount = (Integer) pair.getValue();
                leader = (Integer) pair.getKey();
            }
        }
        // Check if occur more than 50%
        if(maxCount < array.length / 2 + 1){
            leader = -1;
        }
        System.out.println(leader);
    }
}
