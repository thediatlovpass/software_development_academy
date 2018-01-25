package com.sda.stack;

public class Element {
    // Next element reference
    Element next;
    // Stored data
    Integer data;

    public Element(Integer data) {
        // After construction next element reference is null
        next = null;
        this.data = data;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }
}
