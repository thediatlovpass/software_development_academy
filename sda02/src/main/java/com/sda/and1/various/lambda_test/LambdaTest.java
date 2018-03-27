package com.sda.and1.various.lambda_test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaTest {
    public static void main(String[] args) {
        Fox fox = new Fox();
        fox.getSound("fox");

        Animal dog = new Animal() {
            @Override
            public void getSound(String input) {
                System.out.println("woof " + input);
            }
        };
        dog.getSound("dog");

        Animal cat = (s) -> System.out.println("meow " + s);
        cat.getSound("cat");
        cat.getLook();


        Zoo zoo = () -> {
            System.out.println("Lion");
            System.out.println("Cat");
        };
        zoo.getAnimals();

        Consumer<String> pig = System.out::println;
        Consumer<String> temp = s -> System.out.println("hum hrum " + s);
//        pig.andThen(temp);
        pig.andThen(temp).accept("pig");

        Function<String, Integer> getLength = String::length;
        Function<Integer, Integer> increment = input -> input + 1;
        System.out.println(increment.apply(1));
        List<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Sebastian");
        names.add("Dariusz");
        names.add("Marek");
        names.add("Filip");
        names.add("Anna");
        names.add("Marek");
        names.add("Michał");
        names.add("Mateusz");
        names.add("Anna");
        names.add("Magda");
        names.add("Wojciech");
        names.add("Roman");
        names.add("Bartosz");
        names.add("Paweł");
        names.add("Jarosław");
        names.add("Rafał");
        ContainsUSz containsUSz = new ContainsUSz();
        String s1 = names.stream().map(s -> s += s.length()).filter(containsUSz).findAny().get();

        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(3);
        ints.add(6);
        ints.add(-1);
        ints.add(5);
        List<Integer> sorted = ints.stream().sorted().collect(Collectors.toList());
    }
}
