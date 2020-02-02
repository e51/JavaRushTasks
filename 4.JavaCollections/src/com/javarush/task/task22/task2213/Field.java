package com.javarush.task.task22.task2213;

public class Field {
    private int width;
    private int height;
    private int[][] matrix;

    public Field(int width, int height) {
        this.width = width;
        this.height = height;
        matrix = new int[height][width];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void print() {
        for (int x = 0; x < height; x++) {
            for (int y = 0; y < width; y++) {
                if (matrix[x][y] == 0)
                    System.out.print('.');
                else
                    System.out.print('X');
            }
            System.out.println();
        }
    }

    public void removeFullLines() {
        
    }

    public Integer getValue(int x, int y) {
        return 0;
    }

    public void setValue(int x, int y, int value) {

    }
}
