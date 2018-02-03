package com.sda.sorters;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final String PROMPT_SIGN = "> ";
    public static final String SPLIT_STRING = " ";
    public static final String ADD_COMMAND = "add";
    public static final String EXIT_COMMAND = "exit";
    public static final String COMMAND_NOT_RECOGNIZED = "Command not recognized";
    public static final String DISPLAY_COMMAND = "display";
    public static final String REMOVE_COMMAND = "remove";

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
                case DISPLAY_COMMAND: {
                    System.out.println(list.toString());
                    break;
                }
                case REMOVE_COMMAND: {
                    removeElement(list, inputSplitArray);
                    break;
                }
                default: {
                    System.out.println(COMMAND_NOT_RECOGNIZED);
                }
            }
        }
    }

    private static void removeElement(List<Integer> list, String[] inputSplitArray) {
        for (int i = 1; i < inputSplitArray.length; i++) {
            list.remove(Integer.valueOf(inputSplitArray[i]));
        }
        System.out.println(REMOVE_COMMAND + " " + list.toString());
    }

    private static void addElement(List<Integer> list, String[] inputSplitArray) {
        for (int i = 1; i < inputSplitArray.length; i++) {
            list.add(Integer.valueOf(inputSplitArray[i]));
        }
        System.out.println(ADD_COMMAND + " " + list.toString());
    }
}
