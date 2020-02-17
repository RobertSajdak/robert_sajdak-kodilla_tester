package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    public Rectangle() {
        super(11, 7);
    }

    @Override
    public void calculateTheArea() {
        System.out.println("The area this rectangle is: " + getA()*getB());
    }

    @Override
    public void calculateTheCircumference() {
        System.out.println("The circumference this rectangle is: " + (getA()+getB())*2);
    }
}