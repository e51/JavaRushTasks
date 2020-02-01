package com.javarush.task.task25.task2515;

import java.util.Random;

public class Ufo extends BaseObject {
    //картинка НЛО для отрисовки
    private static int[][] matrix = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0},
            {1, 1, 1, 1, 1},
            {1, 0, 1, 0, 1},
    };

    private double dx = 0;
    private double dy = 0;

    public Ufo(double x, double y) {
        super(x, y, 3);
    }

    @Override
    public void move() {
        dx = Math.random() * 2 - 1; //-1..1
        dy = Math.random() * 2 - 1; //-1..1

        x = x + dx;
        y = y + dy;

        checkBorders(radius, Space.game.getWidth() - radius + 1, 0, Space.game.getHeight() / 2);

        if (new Random().nextInt(10) == 1)
            fire();

    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawMatrix(x - radius + 1, y - radius + 1, matrix, 'U');
    }

    public void fire() {
        Space.game.getBombs().add(new Bomb(x, y + radius));
    }
}
