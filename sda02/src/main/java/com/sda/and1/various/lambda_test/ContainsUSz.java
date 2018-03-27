package com.sda.and1.various.lambda_test;

import java.util.function.Predicate;

public class ContainsUSz implements Predicate<String> {

    @Override
    public boolean test(String s) {
        return s.contains("usz");
    }
}
