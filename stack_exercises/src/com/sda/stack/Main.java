package com.sda.stack;

public class Main {
    public static void main(String[] args) {
        // Create elements to add to stack
        Element element1 = new Element(21);
        Element element2 = new Element(34);
        Element element3 = new Element(25);
        Element element4 = new Element(45);

        // Create our stack implementation object
        MyStack stack = new MyStack();
        stack.push(element1);
        stack.push(element2);
        stack.push(element3);
        stack.push(element4);

        Element popElement = stack.pop();
    }
}
