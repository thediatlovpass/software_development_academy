package com.sda.sorters;

import java.time.Duration;
import java.time.Instant;

public abstract class AbstractSort {
    protected abstract void sortImpl(Integer[] array, boolean orderAsc);

    public void sort(Integer[] array, boolean orderAsc) {
        Instant start = Instant.now();
        sortImpl(array, orderAsc);
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");
    }

}
