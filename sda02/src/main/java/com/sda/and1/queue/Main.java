package com.sda.and1.queue;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue();
        queue.add(1);
        queue.add(3);
        queue.add(5);

        Integer first = queue.remove();
    }
}
