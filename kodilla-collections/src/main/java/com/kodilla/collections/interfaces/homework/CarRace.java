package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {
        Ford ford = new Ford(35);
        Ford anotherford = new Ford(44);
        Ford fiestaford = new Ford(97);
        doRace(ford);
        doRace(anotherford);
        doRace(fiestaford);

        Opel opel = new Opel(44);
        Opel astraopel = new Opel(57);
        doRace(opel);
        doRace(anotherford);

        Fiat fiat = new Fiat(33);
        Fiat tipofiat = new Fiat(88);
        doRace(fiat);
        doRace(tipofiat);
    }
    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();

        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println(car.getSpeed());
    }
}