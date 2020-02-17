package com.kodilla.abstracts.homework;

public class Circle extends Shape {

    public Circle() {
        super(8, 0);
    }

    @Override
    public void calculateTheArea() {
        System.out.println("The area this circle is: " + 3.14*getA()*getA());
    }

    @Override
    public void calculateTheCircumference() {
        System.out.println("The circumference this triangle is: " + 2*3.14*getA());
    }
}