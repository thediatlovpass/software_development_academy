package com.sda.sorters.actions;

import java.util.List;

public class DisplayAction implements Action {
    @Override
    public void doAction(List<Integer> list, String[] args) {
        System.out.println(list.toString());
    }
}
