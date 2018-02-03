package com.sda.sorters;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final String PROMPT_SIGN = "> ";
    public static final String SPLIT_STRING = " ";
    public static final String ADD_COMMAND = "add";
    public static final String EXIT_COMMAND = "exit";

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String command = " ";
        while (!command.equalsIgnoreCase(EXIT_COMMAND)) {
            System.out.print(PROMPT_SIGN);
            String inputString = scanner.nextLine();
            String[] inputSplitArray = inputString.split(SPLIT_STRING);
            command = inputSplitArray[0];
            switch (command) {
                case ADD_COMMAND: {
                    addElement(list, inputSplitArray);
                    break;
                }
                case EXIT_COMMAND: {
                    System.out.println(EXIT_COMMAND);
                    break;
                }
            }
        }
    }

    private static void addElement(List<Integer> list, String[] inputSplitArray) {
        for (int i = 1; i < inputSplitArray.length; i++) {
            list.add(Integer.valueOf(inputSplitArray[i]));
        }
        System.out.println(ADD_COMMAND + " " + list.toString());
    }
}
