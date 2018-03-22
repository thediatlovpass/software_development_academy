package com.sda.various.maze;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Maze {
    public static void main(String[] args) {
        int[][] maze1 = {
                {1, 0, 1, 1},
                {1, 0, 0, 1},
                {1, 1, 0, 1}
        };
        int[][] maze2 = {
                {1, 0, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 1, 0, 1, 0, 1},
                {1, 0, 0, 1, 0, 0},
                {1, 1, 0, 1, 0, 1},
                {1, 1, 1, 1, 0, 1}
        };
        solveMazeTabuStack(maze1);
        solveMazeTabuStack(maze2);
        solveMazeRecursively(maze1);
        solveMazeRecursively(maze2);
    }

    private static void solveMazeRecursively(int[][] maze) {
        int entrancePosition = findEntrance(maze[0]);
        recurseMaze(maze, entrancePosition, 0, entrancePosition, 0, 1);
    }

    private static int findEntrance(int[] ints) {
        int entrancePosition = -1;
        int count = 1;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == 0) {
                entrancePosition = i;
                break;
            }
        }
        return entrancePosition;
    }

    private static void recurseMaze(int[][] maze, int x, int y, int xBefore, int yBefore, int count) {
        if (y == maze.length - 1) {
            System.out.println("Recursion solution: " + count);
            return;
        }
        if (maze[y + 1][x] == 0 && y + 1 != yBefore) {
            recurseMaze(maze, x, y + 1, x, y, count + 1);
        }
        if (y - 1 > 0 && maze[y - 1][x] == 0 && y - 1 != yBefore) {
            recurseMaze(maze, x, y - 1, x, y, count + 1);
        }
        if (x - 1 > 0 && maze[y][x - 1] == 0 && x - 1 != xBefore) {
            recurseMaze(maze, x - 1, y, x, y, count + 1);
        }
        if (x + 1 < maze[0].length && maze[y][x + 1] == 0 && x + 1 != xBefore) {
            recurseMaze(maze, x + 1, y, x, y, count + 1);
        }
        return;
    }

    private static void solveMazeTabuStack(int[][] maze) {
        int entrancePosition = findEntrance(maze[0]);
        int count = 1;
//        System.out.println("Entrance: " + entrancePosition);
        Position pos = new Position(entrancePosition, 0);
        Stack<Position> stack = new Stack<>();
        Position currPos = new Position(pos);
        stack.push(currPos);
        List<Position> tabu = new ArrayList<>();
        while (pos.getY() < maze.length - 1) {
//            System.out.println("X: " + pos.getX() + " Y: " + pos.getY());
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
        System.out.println("Tabu/stack solution: " + count);
    }
}
