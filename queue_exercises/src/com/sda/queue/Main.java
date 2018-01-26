package com.sda.queue;

public class Main {
    public static void main(String[] args) {
        // Create elements to add to queue
        Element element1 = new Element(21);
        Element element2 = new Element(34);
        Element element3 = new Element(25);
        Element element4 = new Element(45);

        // Create our queue implementation object
        MyQueue stack = new MyQueue();
        stack.enqueue(element1);
        stack.enqueue(element2);
        stack.enqueue(element3);
        stack.enqueue(element4);

        Element popElement = stack.dequeue();
    }
}
