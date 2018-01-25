package com.sda.stack;

public class MyStack {
    // Reference to element on the top of the stack
    Element head;
    // Elements number in the stack
    int count;

    public Element getHead() {
        return head;
    }

    public void setHead(Element head) {
        this.head = head;
    }

    public int getCount() {
        return count;
    }

    /**
     * Adds element to stack - push in on top
     * @param elementToAdd
     */
    public void push(Element elementToAdd){
        if(head != null){
            // if stack is not empty set elementToAdd.next reference to current head element
            elementToAdd.setNext(head);
        }
        // elementToAdd become head
        head = elementToAdd;
        count++;
    }

    /**
     * Removes first element from stack - pop (take) first element from the top of stack
     * @return
     */
    public Element pop(){
        // Check if stack is not empty
        if(this.head != null) {
            Element currentTop = this.head;
            // Assign next element of currentTop to head
            head = currentTop.getNext();
            count--;
            return currentTop;
        }
        return null;
    }
}
