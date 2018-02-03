package com.sda.sorters;

import com.sda.sorters.actions.*;

import java.util.*;

public class Main {

    public static final String PROMPT_SIGN = "> ";
    public static final String SPLIT_STRING = " ";
    public static final String ADD_COMMAND = "add";
    public static final String EXIT_COMMAND = "exit";
    public static final String COMMAND_NOT_RECOGNIZED = "Command not recognized";
    public static final String DISPLAY_COMMAND = "display";
    public static final String REMOVE_COMMAND = "remove";
    public static final String GENERATE_COMMAND = "generate";
    public static final String REMOVE_ALL_COMMAND = "remove_all";
    public static final String SORT_COMMAND = "sort";

    public static void main(String[] args) {
        Map<String, Action> actions = new HashMap<>();
        actions.put(ADD_COMMAND, new AddAction());
        actions.put(REMOVE_COMMAND, new RemoveAction());
        actions.put(GENERATE_COMMAND, new GenerateAction());
        actions.put(GENERATE_COMMAND + "1000", new GenerateAction(1000));
        actions.put(DISPLAY_COMMAND, new DisplayAction());
        actions.put(REMOVE_ALL_COMMAND, new RemoveAllAction());
        actions.put(SORT_COMMAND, new SortAction());
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String command = " ";
        while (!command.equalsIgnoreCase(EXIT_COMMAND)) {
            System.out.print(PROMPT_SIGN);
            String inputString = scanner.nextLine();
            String[] inputSplitArray = inputString.split(SPLIT_STRING);
            command = inputSplitArray[0];
            Action currentAction = actions.get(command);
            if (currentAction == null) {
                System.out.println(COMMAND_NOT_RECOGNIZED);
            } else {
                currentAction.doAction(list, inputSplitArray);
            }
        }
    }
}
