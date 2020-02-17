package com.kodilla.abstracts.homework;

public class Coach extends Job {

    public Coach() {
        super(9000, "coaching, training, motivation");
    }

    @Override
    public void annualSalary() {
        System.out.println("The coach's annual salary is: " + getSalary()*12);
    }
}
