package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {
        Ford ford = new Ford();
        Ford anotherford = new Ford();
        Ford fiestaford = new Ford();
        doRace(ford);
        doRace(anotherford);
        doRace(fiestaford);

        Opel opel = new Opel();
        Opel astraopel = new Opel();
        doRace(opel);
        doRace(anotherford);

        Fiat fiat = new Fiat();
        Fiat tipofiat = new Fiat();
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
