package com.sda.sorters.actions;

import java.util.List;

public class RemoveAllAction implements Action {
    @Override
    public void doAction(List<Integer> list, String[] args) {
        list.clear();
    }
}
