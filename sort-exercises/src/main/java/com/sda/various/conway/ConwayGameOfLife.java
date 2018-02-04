package com.sda.various.conway;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Transient;
import java.util.Random;


@SuppressWarnings("serial")
public class ConwayGameOfLife extends JPanel {

    private int[][] grid;
    private static final Random rnd = new Random();
    private int generationCounter;

    public ConwayGameOfLife(int width, int height) {
        this.grid = new int[width / 4][height / 4];
        init();
    }

    private void init() {
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                grid[j][i] = getRandom();
            }
        }
    }

    private int getRandom() {
        double random = Math.random();
        return random > 0.92 ? 1 : 0;
    }

    public void updateGrid() {
        int[][] tempArray = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                tempArray[j][i] = isAlive(i, j);
            }
        }
        grid = tempArray;
    }

    private int isAlive(int posX, int posY) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int newPosX = posX + i;
                int newPosY = posY + j;
                if (newPosX >= 0 && newPosX < grid[0].length
                        && newPosY >= 0 && newPosY < grid.length
                        && grid[newPosY][newPosX] == 1) {
                    if (i == 0 && j == 0) continue;
                    count++;
                }
            }
        }
        if (count == 3 && grid[posY][posX] == 0) {
            return 1;
        } else if (grid[posY][posX] == 1 && count >= 2 && count <= 3) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    @Transient
    public Dimension getPreferredSize() {
        return new Dimension(grid.length * 4, grid[0].length * 4);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Color gColor = g.getColor();

        g.drawString("Generation: " + generationCounter++, 0, 10);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    g.setColor(Color.red);
                    g.fillRect(j * 4, i * 4, 4, 4);
                }
            }
        }

        g.setColor(gColor);
    }

    public static void main(String[] args) {
        final ConwayGameOfLife c = new ConwayGameOfLife(800, 800);
        JFrame frame = new JFrame();
        frame.getContentPane().add(c);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
        new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.updateGrid();
                c.repaint();
            }
        }).start();
    }
}
