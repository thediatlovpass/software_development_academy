package com.sda.list;

public class MyList {
    // First element of the list
    Element head = null;
    // Last element of the list
    Element tail = null;
    // Elements number in the list
    int count;

    public Element getHead() {
        return head;
    }

    public void setHead(Element head) {
        this.head = head;
    }

    public Element getTail() {
        return tail;
    }

    public void setTail(Element tail) {
        this.tail = tail;
    }

    public int getCount() {
        return count;
    }

    /**
     * Adds element on the first place in the list
     * @param newFirst - element to add
     */
    public void addFirst(Element newFirst) {
        if (head != null) {
            // If head is not null the list is not empty - set new element next reference to current head
            newFirst.setNext(head);
            // For current head set previous element to new element
            head.setPrevious(newFirst);
        } else {
            // If head is empty -> list is empty -> new element is head and tail in the same time
            tail = newFirst;
        }
        // New element is new head
        head = newFirst;
        count++;
    }

    /**
     * Add element as last in the list
     * @param newLast - element to add
     */
    public void addLast(Element newLast) {
        if (tail != null) {
            // If tails is not null the list is not empty - set old tail next reference to new element
            tail.setNext(newLast);
            // New element previous will be old tail
            newLast.setPrevious(tail);
        } else {
            // If tail is empty -> list is empty -> new element is head and tail in the same time
            head = newLast;
        }
        // New element is new tail
        tail = newLast;
        count++;
    }

    /**
     * Removes element from list
     * @param elementToRemove
     */
    public void remove(Element elementToRemove) {
        Element currentElement = head;
        // Loop till current element is not null
        while (currentElement != null) {
            // Check if currentElement and elementToRemove are the same
            if (currentElement.equals(elementToRemove)) {
                removeReference(currentElement);
                // Break loop
                break;
            }
            // Get next element and assign it reference to currentElement variable
            currentElement = currentElement.getNext();
        }
    }

    /**
     * Removes reference to elementToRemove
     * @param elementToRemove
     */
    private void removeReference(Element elementToRemove) {
        Element elementToRemovePrevious = elementToRemove.getPrevious();
        Element elementToRemoveNext = elementToRemove.getNext();
        if (elementToRemovePrevious == null) {
            // If previous is null then elementToRemove is current head - if we want to delete him we have to set head to his next element
            head = elementToRemoveNext;
        } else {
            // Set elementToRemovePrevious next reference to next element of elementToRemove
            elementToRemovePrevious.setNext(elementToRemoveNext);
        }
        if (elementToRemoveNext == null) {
            // If next is null then elementToRemove is current tail - if we want to delete him we have to set tail to his previous element
            tail = elementToRemovePrevious;
        } else {
            // Set elementToRemoveNext previous reference to previous element of elementToRemove
            elementToRemoveNext.setPrevious(elementToRemovePrevious);
        }
        count--;
    }
}
