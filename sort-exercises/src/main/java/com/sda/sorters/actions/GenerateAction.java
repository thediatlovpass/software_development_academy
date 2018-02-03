package com.sda.sorters.actions;

import java.util.List;

import static com.sda.sorters.Main.GENERATE_COMMAND;

public class GenerateAction implements Action {

    private int highestNumber = 100;

    public GenerateAction(int highestNumber) {
        this.highestNumber = highestNumber;
    }

    public GenerateAction() {
    }

    @Override
    public void doAction(List<Integer> list, String[] args) {
        if (args.length > 1) {
            for (int i = 0; i < Integer.valueOf(args[1]); i++) {
                list.add((int) (Math.random() * highestNumber));
            }
            System.out.println(GENERATE_COMMAND + " " + list.toString());
        }
    }
}
