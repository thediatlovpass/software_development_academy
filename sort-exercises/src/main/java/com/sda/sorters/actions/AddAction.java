package com.sda.sorters.actions;

import java.util.List;

import static com.sda.sorters.Main.ADD_COMMAND;

public class AddAction implements Action {
    @Override
    public void doAction(List<Integer> list, String[] args) {
        for (int i = 1; i < args.length; i++) {
            list.add(Integer.valueOf(args[i]));
        }
        System.out.println(ADD_COMMAND + " " + list.toString());
    }
}
