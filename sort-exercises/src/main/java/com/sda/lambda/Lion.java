package com.sda.lambda;

public class Lion implements Animal {

    @Override
    public void sound(String m) {
        System.out.println("Lion " + m);
    }
}
