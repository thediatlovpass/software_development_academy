package com.sda.and1.various;

public class MazeSolver {
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
        solveMaze(maze1);

    }

    public static int findStart(int[] maze1) {
        int i = 0;
        while (maze1[i] != 0) {
            i++;
        }return i;
    }

    public static void solveMaze(int[][] maze1) {
        int x = findStart(maze1[0]);
        int y = 0;
        System.out.println(y + " " + x);
    }

}
