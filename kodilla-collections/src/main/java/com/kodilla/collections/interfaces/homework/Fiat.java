package com.kodilla.collections.interfaces.homework;

public class Fiat implements Car {

    int speed = 0;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed = this.speed + 25;
    }

    @Override
    public void decreaseSpeed() {
        this.speed = this.speed - 15;
    }

    @Override
    public String getColor() {
        return null;
    }
}
