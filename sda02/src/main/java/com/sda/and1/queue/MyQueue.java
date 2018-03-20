package com.sda.and1.queue;

public class MyQueue<T> {
    private Element head;
    private Element tail;
    private int count;

    public boolean isEmpty() {
        return head == null;
    }

    public void add(T elementToAdd) {
        Element newElement = new Element(elementToAdd);
        if (isEmpty()) {
            head = newElement;
            tail = newElement;
        } else {
            Element currentLast = tail;
            currentLast.setNext(newElement);
            tail = newElement;
        }
        count++;
    }

    public T remove(){
        Element currentHead = this.head;
        if (currentHead == null) {
            return null;
        }
        this.head = currentHead.getNext();
        count--;
        return (T) currentHead.getData();
    }
}
