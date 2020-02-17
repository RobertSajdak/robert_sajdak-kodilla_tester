package com.kodilla.abstracts.homework;

public class App {

    public static void main(String[] args) {

        Square square = new Square();
        square.calculateTheArea();
        square.calculateTheCircumference();
        System.out.println("---------------------");
        Rectangle rectangle = new Rectangle();
        rectangle.calculateTheArea();
        rectangle.calculateTheCircumference();
        System.out.println("---------------------");
        Circle circle = new Circle();
        circle.calculateTheArea();
        circle.calculateTheCircumference();

        Person trainer = new Person("Black", 35, new Coach());
        trainer.myResponsibilities();
    }
}
