package com.kodilla.inheritance.homework;

public class App {

    public static void main(String[] args) {

        MySystem_1 mySystem_1 = new MySystem_1(2020);
        mySystem_1.producerOfSystem();

        MySystem_2 mySystem_2 = new MySystem_2(2019);
        mySystem_2.turnOff();
    }
}
