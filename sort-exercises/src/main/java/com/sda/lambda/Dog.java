package com.sda.lambda;

public class Dog implements Animal {
    @Override
    public void sound(String m) {
        System.out.println("Dog " + m);
    }
}
