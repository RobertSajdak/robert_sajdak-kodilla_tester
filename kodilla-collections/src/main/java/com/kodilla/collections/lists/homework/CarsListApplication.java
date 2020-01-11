package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.homework.Car;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car() {
            @Override
            public int getSpeed() {
                return 0;
            }

            @Override
            public void increaseSpeed() {

            }

            @Override
            public void decreaseSpeed() {

            }

            @Override
            public String getColor() {
                return null;
            }
        });

    }
}
