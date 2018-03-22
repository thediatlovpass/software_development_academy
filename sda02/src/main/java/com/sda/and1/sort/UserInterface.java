package com.sda.and1.sort;

import com.sda.and1.sort.boubble_sort.BubbleSort;
import com.sda.and1.sort.insert_sort.InserSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class UserInterface {
    public static void main(String[] args) {
        boolean exit = false;
        List<Integer> arrayList = new ArrayList<>();
        while (!exit) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("> ");
            String inputStrem = scanner.nextLine();
            String[] split = inputStrem.split(" ");
            String comend = split[0];
            String value = "";
            if (split.length > 1) {
                value = split[1];
            }
            switch (comend) {
                case "add":
                    System.out.println(comend);
                    add(arrayList, value);
                    break;
                case "show":
                    System.out.println(arrayList);
                    break;
                case "remove":
                    remove(arrayList, value);
                    break;
                case "generate":
                    generate(arrayList, value);
                    break;
                case "exit":
                    exit = true;
                    break;
                case "sort":
                    sort(arrayList, value);
                    break;
                default:
                    System.out.println("Invalid input");
            }

        }
    }

    private static void remove(List<Integer> arrayList, String value) {
        int intValue = Integer.parseInt(value);
        if (intValue < arrayList.size()) {
            arrayList.remove(intValue);
        } else {
            System.out.println("Out of bounds!");
        }
    }

    private static void add(List list, String elementToAdd) {
        list.add(elementToAdd);

    }

    private static void generate(List<Integer> list, String n) {
        int intValue = Integer.parseInt(n);
        for (int i = 0; i < intValue; i++) {
            int x = ThreadLocalRandom.current().nextInt(100);
            list.add(x);
        }
    }

    private static void sort(List<Integer> list, String sortType) {
        Integer[] temp = list.toArray(new Integer[list.size()]);
        switch (sortType) {
            case "bubbleSort":
                BubbleSort.bubbleSort(temp);
                break;
            case "insertSort":
                InserSort.insertSort(temp);
                break;

            default:
                System.out.println("Invalid command");

        }
        System.out.println(Arrays.asList(temp));
    }
}
