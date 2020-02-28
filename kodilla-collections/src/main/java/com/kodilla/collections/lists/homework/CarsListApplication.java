package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Fiat;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Opel(33));
        cars.add(new Opel(58));
        cars.add(new Fiat(45));
        cars.add(new Fiat(99));
        cars.add(new Ford(63));

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
        cars.remove(1);
        cars.remove(new Fiat(45));

        System.out.println(cars.size());
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}