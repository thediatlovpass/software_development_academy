package com.sda.and1.tree.heap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.add(25);
        heap.add(12);
        heap.add(11);
        heap.add(8);
        heap.add(10);
        heap.add(6);
        heap.add(9);
        heap.add(6);
        heap.add(7);
        heap.add(9);
        heap.add(3);
        heap.add(5);
        heap.add(4);
        heap.add(3);

        heap.remove();
    }
}
