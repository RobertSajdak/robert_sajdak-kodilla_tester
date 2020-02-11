package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int publicationDateOperatingSystem;

    public OperatingSystem (int publicationDateOperatingSystem) {
        this.publicationDateOperatingSystem = publicationDateOperatingSystem;
    }

    public void turnOn() {
        System.out.println("System were turned on");
    }

    public void turnOff() {
        System.out.println("System were turned off");
    }

    public int getPublicationDateOperatingSystem() {
        return publicationDateOperatingSystem;
    }
}