package com.kodilla.inheritance.homework;

public class MySystem_1 extends OperatingSystem {

    public MySystem_1(int publicationDateOperatingSystem) {
        super(publicationDateOperatingSystem);
    }

    public void producerOfSystem() {
        System.out.println("This system is product by AAA Corp.");
    }

    @Override
    public void turnOn() {
        System.out.println("System were turned 2 years ago");
    }
}