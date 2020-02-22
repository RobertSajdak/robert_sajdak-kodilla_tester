package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);

        double a = random.nextDouble() * 50 + 1;
        double b = random.nextDouble() * 50 + 1;
        double c = random.nextDouble() * 50 + 1;

        if (drawnCarKind == 0)
            return new Fiat();
        else if (drawnCarKind == 1)
            return new Ford();
        else
            return new Opel();
    }
}