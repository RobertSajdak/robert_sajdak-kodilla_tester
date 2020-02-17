package com.kodilla.abstracts.homework;

public class Accountant extends Job {

    public Accountant() {
        super(11000, "accounting, the financial balance, calculation of salary");
    }

    @Override
    public void annualSalary() {
        System.out.println("The accountant's annual salary is: " + getSalary()*12);
    }
}
