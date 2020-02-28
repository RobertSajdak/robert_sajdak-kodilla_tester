package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Opel implements Car {
    public Opel(int speed) {
        this.speed = speed;
    }

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
    public String getColour() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opel opel = (Opel) o;
        return speed == opel.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}