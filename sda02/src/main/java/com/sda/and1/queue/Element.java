package com.sda.and1.queue;

public class Element<T> {
    private Element next;
    private T data;

    public Element(T data) {
        this.data = data;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }
}
