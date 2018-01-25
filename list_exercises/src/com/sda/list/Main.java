package com.sda.list;

public class Main {
    public static void main(String[] args) {
        // Create list elements
        Element element1 = new Element(21);
        Element element2 = new Element(34);
        Element element3 = new Element(25);
        Element element4 = new Element(45);

        // Create our list implementation object
        MyList myList = new MyList();
        myList.addFirst(element1);
        myList.addFirst(element2);
        myList.addFirst(element3);
        myList.addLast(element4);
        myList.remove(element1);
        myList.remove(element2);
        myList.remove(element3);
        myList.remove(element4);
    }
}
