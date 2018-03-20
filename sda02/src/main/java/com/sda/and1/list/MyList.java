package com.sda.and1.list;

public class MyList {
    Element head;
    Element tail;
    int count = 0;

    public boolean isEmpty() {
        return head == null;
    }

    public void addElementFirst(Element firstElement) {
        if (isEmpty()) {
            head = firstElement;
            tail = firstElement;
        } else {
            Element currentFirst = this.head;
            firstElement.setNext(currentFirst);
            currentFirst.setPrevious(firstElement);
            this.head = firstElement;
        }
        count++;
    }

    public void addElementLast(Element lastElement) {
        if (isEmpty()) {
            head = lastElement;
            tail = lastElement;
        } else {
            Element currentLast = this.tail;
            lastElement.setPrevious(currentLast);
            currentLast.setNext(lastElement);
            this.tail = lastElement;
        }
        count++;
    }

    public void remove(Element element) {
        if (!isEmpty()) {
            Element currentElement = head;
            while (currentElement != null) {
                if (currentElement.equals(element)) {
                    Element previousElement = currentElement.getPrevious();
                    Element nextElement = currentElement.getNext();
                    if (previousElement != null) {
                        previousElement.setNext(nextElement);
                    } else {
                        head = nextElement;
                    }
                    if (nextElement != null) {
                        nextElement.setPrevious(previousElement);
                    }else {
                        tail = previousElement;
                    }
                    count--;
                    currentElement = null;
                } else {
                    currentElement = currentElement.getNext();
                }
            }
        }
    }
}
