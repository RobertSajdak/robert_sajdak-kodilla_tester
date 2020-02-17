package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public Square() {
        super(5, 5);
    }

    @Override
    public void calculateTheArea() {
        System.out.println("The area this square is: " + getA()*getB());
    }

    @Override
    public void calculateTheCircumference() {
        System.out.println("The circumference this square is: " + (getA()+getB())*2);
    }
}