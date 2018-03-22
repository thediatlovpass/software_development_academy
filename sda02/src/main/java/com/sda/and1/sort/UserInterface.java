package com.sda.and1.sort;

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
            System.out.println("> ");
            String inputStrem = scanner.nextLine();
            String[] split = inputStrem.split(" ");
            String comend = split[0];
            int value = 0;
            if (split.length > 1) {
                value = Integer.parseInt(split[1]);
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
                    sort(arrayList);
                    break;
                    default:
                        System.out.println("Invalid input");
            }

        }
    }

    private static void remove(List<Integer> arrayList, int value) {
        if (value < arrayList.size()) {
            arrayList.remove(value);
        } else {
            System.out.println("Out of bounds!");
        }
    }

    private static void add(List list, Integer elementToAdd) {
        list.add(elementToAdd);

    }
    private static void generate(List<Integer> list,int n){
        for(int i = 0; i<n;i++) {
            int x = ThreadLocalRandom.current().nextInt(100);
            list.add(x);
        }
    }
    private static void sort(List<Integer> list) {
        Integer[] temp =  list.toArray(new Integer[list.size()]);
        InserSort.insertSort(temp);
        System.out.println(Arrays.asList(temp));
    }
}
