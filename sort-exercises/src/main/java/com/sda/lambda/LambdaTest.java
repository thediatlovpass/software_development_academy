package com.sda.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaTest {

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.sound("roar");
        Dog dog = new Dog();
        dog.sound("woof");
// Klasa anonimowa
        Animal polishBird = new Animal() {
            @Override
            public void sound(String m) {
                System.out.println("Polish bird " + m);
            }
        };
        polishBird.sound("cle cle");

        Animal pig = m -> System.out.println("Pig " + m);
        pig.sound("oink oink");

        Consumer<String> cat = m -> System.out.println("Cat " + m);
        cat.accept("meow");

        Consumer<Integer> calculateRectangleArea = integer -> System.out.println(integer*integer);
        calculateRectangleArea.accept(4);

        Function<Integer, Integer> calculateRectangleAreaWithResult = integer -> integer*integer;
        Integer area = calculateRectangleAreaWithResult.apply(4);

        List<String> tests = new ArrayList<>();
        tests.add("cab");
        tests.add("abc");
        tests.add("aabbcc");
        tests.add("abcd");
        tests.add("abcde");
        tests.add("abcdef");
        tests.add("abcdeg");
        List<String> a = tests.stream().filter(s -> s.matches("[abc]+")).collect(Collectors.toList());
    }
}
