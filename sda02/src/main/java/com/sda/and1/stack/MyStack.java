package com.sda.and1.stack;

public class MyStack {
    private Element head;
    private int count;

    public boolean isEmpty() {
        return head == null;
    }

    public void push(Element elementToAdd) {
        Element currentHead = this.head;
        this.head = elementToAdd;
        elementToAdd.setNext(currentHead);
        count++;
    }

    public Element pop() {
        Element currentHead = this.head;
        if (currentHead == null) {
            return null;
        }
        this.head = currentHead.getNext();
        count--;
        return currentHead;
    }

}
