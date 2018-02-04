package com.sda.various.maze;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Maze {
    public static void main(String[] args) {
//        int[][] maze1 = {
//                {1, 0, 1, 1},
//                {1, 0, 0, 1},
//                {1, 1, 0, 1}
//        };
//        solveMaze(maze1);
        int[][] maze2 = {
                {1, 0, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 1, 0, 1, 0, 1},
                {1, 0, 0, 1, 0, 0},
                {1, 1, 0, 1, 0, 1},
                {1, 1, 1, 1, 0, 1}
        };
        solveMaze(maze2);
    }

    private static void solveMaze(int[][] maze) {
        int entrancePosition = -1;
        int count = 1;
        for (int i = 0; i < maze[0].length; i++) {
            if (maze[0][i] == 0) {
                entrancePosition = i;
                break;
            }
        }
        System.out.println("Entrance: " + entrancePosition);
        Position pos = new Position(entrancePosition, 0);
        Stack<Position> stack = new Stack<>();
        Position currPos = new Position(pos);
        stack.push(currPos);
        List<Position> tabu = new ArrayList<>();
        while (pos.getY() < maze.length - 1) {
            System.out.println("X: " + pos.getX() + " Y: " + pos.getY());
            Position currentPos = new Position(pos);
            if (maze[pos.getY() + 1][pos.getX()] == 0
                    && !stack.stream().anyMatch(position -> position.getX() == currentPos.getX() && position.getY() == currentPos.getY() + 1)
                    && !tabu.stream().anyMatch(position -> position.getX() == currentPos.getX() && position.getY() == currentPos.getY() + 1)) {
                pos.moveDown();
                stack.push(new Position(pos));
                count++;
            } else if (maze[pos.getY() - 1][pos.getX()] == 0
                    && !stack.stream().anyMatch(position -> position.getX() == currentPos.getX() && position.getY() == currentPos.getY() - 1)
                    && !tabu.stream().anyMatch(position -> position.getX() == currentPos.getX() && position.getY() == currentPos.getY() - 1)) {
                pos.moveUp();
                stack.push(new Position(pos));
                count++;
            } else if (maze[pos.getY()][pos.getX() - 1] == 0
                    && !stack.stream().anyMatch(position -> position.getX() == currentPos.getX() - 1 && position.getY() == currentPos.getY())
                    && !tabu.stream().anyMatch(position -> position.getX() == currentPos.getX() - 1 && position.getY() == currentPos.getY())) {
                pos.moveLeft();
                stack.push(new Position(pos));
                count++;
            } else if (maze[pos.getY()][pos.getX() + 1] == 0
                    && !stack.stream().anyMatch(position -> position.getX() == currentPos.getX() + 1 && position.getY() == currentPos.getY())
                    && !tabu.stream().anyMatch(position -> position.getX() == currentPos.getX() + 1 && position.getY() == currentPos.getY())) {
                pos.moveRight();
                stack.push(new Position(pos));
                count++;
            } else {
                stack.pop();
                pos = new Position(stack.peek());
                tabu.add(new Position(currentPos));
                count--;
            }
        }
        System.out.println("Solution: " + count);
    }
}
