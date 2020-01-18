package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {

    int speed = 0;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed = this.speed + 20;
    }

    @Override
    public void decreaseSpeed() {
        this.speed = this.speed - 10;
    }

    @Override
    public String getColor() {
        return null;
    }
}
