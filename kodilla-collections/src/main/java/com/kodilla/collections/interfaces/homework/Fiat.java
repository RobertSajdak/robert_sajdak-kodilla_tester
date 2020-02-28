package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Fiat implements Car {
    public Fiat(int speed) {
        this.speed = speed;
    }

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
    public String getColour() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fiat fiat = (Fiat) o;
        return speed == fiat.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
