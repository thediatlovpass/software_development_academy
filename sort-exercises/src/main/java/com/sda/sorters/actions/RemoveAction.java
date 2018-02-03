package com.sda.sorters.actions;

import java.util.List;

import static com.sda.sorters.Main.REMOVE_COMMAND;

public class RemoveAction implements Action {
    @Override
    public void doAction(List<Integer> list, String[] args) {
        for (int i = 1; i < args.length; i++) {
            list.remove(Integer.valueOf(args[i]));
        }
        System.out.println(REMOVE_COMMAND + " " + list.toString());
    }
}
