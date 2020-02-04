package com.javarush.task.task24.task2413;

public class Stand extends BaseObject {
    private double speed;
    private double direction; //-1, 0, 1

    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }

    public Stand(double x, double y) {
        super(x, y, 3);
        speed = 1;
        direction = 0;
    }

    @Override
    public void draw(Canvas canvas) {
        
    }

    @Override
    public void move() {
        x = x + speed * direction;

    }

    void moveLeft() {
        direction = -1;
    }

    void moveRight() {
        direction = 1;
    }
}
