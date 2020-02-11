package com.kodilla.inheritance.homework;

public class MySystem_2 extends OperatingSystem {

    public MySystem_2(int publicationDateOperatingSystem) {
        super(publicationDateOperatingSystem);
    }

    public void producerOfSystem() {
        System.out.println("This system is product by BBB Corp.");
    }

    @Override
    public void turnOff() {
        System.out.println("System were turned off in" + " " + getPublicationDateOperatingSystem());
    }
}