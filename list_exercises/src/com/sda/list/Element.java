package com.sda.list;

public class Element {
    // Reference to previous element
    Element previous;
    // Reference to next element
    Element next;
    // Stored data
    Integer data;

    public Element(Integer data) {
        // After construction previous and next element reference is null
        previous = null;
        next = null;
        this.data = data;
    }

    public Element getPrevious() {
        return previous;
    }

    public void setPrevious(Element previous) {
        this.previous = previous;
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
