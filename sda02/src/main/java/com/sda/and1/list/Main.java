package com.sda.and1.list;

public class Main {
    public static void main(String[] args) {
        Element first = new Element(1);
        Element second = new Element(2);
        Element third = new Element(3);
        Element fourth = new Element(4);

        MyList list = new MyList();
        list.addElementFirst(first);
        list.addElementFirst(second);
        list.addElementFirst(third);
        list.addElementLast(fourth);


        list.remove(third);
    }
}
