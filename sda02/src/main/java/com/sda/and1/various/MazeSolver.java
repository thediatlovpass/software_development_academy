package com.sda.and1.various;

import java.util.Stack;

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

//        Stack<Point> points = new Stack<>();
//        points.push(new Point(1, 1));
//        points.push(new Point(2, 1));
//        points.push(new Point(1, 4));
//        points.push(new Point(16, 1));

//        System.out.println(isExist(new Point(1, 4), points));
//        solveMaze(maze1);
        solveMaze(maze2);

    }

    public static int findStart(int[] maze1) {
        int i = 0;
        while (maze1[i] != 0) {
            i++;
        }
        return i;
    }

    public static void solveMaze(int[][] maze1) {
        Stack<Point> points = new Stack<>();
        int x = findStart(maze1[0]);
        int y = 0;
        Point currentPoint = new Point(x, y);
        while (currentPoint.getY() != maze1.length - 1) {
            System.out.println(currentPoint.getY() + " " + currentPoint.getX());
            if (maze1[currentPoint.getY() + 1][currentPoint.getX()] == 0 && maze1[currentPoint.getY() + 1][currentPoint.getX()] != 2) {
                currentPoint.setY(currentPoint.getY() + 1);
                points.push(new Point(currentPoint));
            } else if (maze1[currentPoint.getY()][currentPoint.getX() + 1] == 0) {
                currentPoint.setX(currentPoint.getX() + 1);
                points.push(new Point(currentPoint));
            } else if (maze1[currentPoint.getY()][currentPoint.getX() - 1] == 0) {
                currentPoint.setX(currentPoint.getX() - 1);
                points.push(new Point(currentPoint));
            } else {
                maze1[currentPoint.getY()][currentPoint.getX()] = 2;
                currentPoint.setY(currentPoint.getY() - 1);
                points.push(new Point(currentPoint));
            }

        }

        System.out.println(currentPoint.getY() + " " + currentPoint.getX());
    }


    public static Point isExist(Point point, Stack<Point> points) {
        Point foundPoint = points.stream()
                .filter(point1 -> point1.getY() == point.getY() && point1.getX() == point.getX())
                .findAny()
                .get();
        return foundPoint;
    }
}
