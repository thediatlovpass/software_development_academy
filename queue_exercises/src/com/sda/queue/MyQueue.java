package com.sda.queue;

public class MyQueue {
    // First element in queue
    Element first;
    // Last element in queue
    Element last;
    // Elements number in the queue
    int count;

    public Element getFirst() {
        return first;
    }

    public void setFirst(Element first) {
        this.first = first;
    }

    public Element getLast() {
        return last;
    }

    public void setLast(Element last) {
        this.last = last;
    }

    public int getCount() {
        return count;
    }


    /**
     * Adds the elementToAdd to queue
     *
     * @param elementToAdd to add
     */
    public void enqueue(Element elementToAdd) {
        Element oldLast = last;
        // Set last reference to new elementToAdd
        last = elementToAdd;
        if (first == null) {
            // If is empty there will be only one elementToAdd which will be first and last in same time
            first = last;
        } else {
            // Not empty -> oldLast elementToAdd next reference to new last (elementToAdd)
            oldLast.setNext(last);
        }
        count++;
    }

    /**
     * Removes and returns the element of queue
     *
     * @return element added first (FIFO)
     */
    public Element dequeue() {
        if (first != null) {
            Element firstElement = first;
            // If queue is not empty new first reference is set to his current next element
            first = first.getNext();
            count--;
            if (first == null) {
                last = null;
            }
            return firstElement;
        }
        return null;
    }
}
