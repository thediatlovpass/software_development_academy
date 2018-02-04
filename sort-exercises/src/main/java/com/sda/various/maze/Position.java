package com.sda.various.maze;

import java.util.Objects;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position(Position pos) {
        x = pos.getX();
        y = pos.getY();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Position) {
            Position second = ((Position) obj);
            if (this.getX() == second.getX() && this.getY() == second.getY()) {
                return true;
            }
        }
        return false;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void moveLeft() {
        x--;
    }

    public void moveRight() {
        x++;
    }

    public void moveDown() {
        y++;
    }

    public void moveUp() {
        y--;
    }
}
