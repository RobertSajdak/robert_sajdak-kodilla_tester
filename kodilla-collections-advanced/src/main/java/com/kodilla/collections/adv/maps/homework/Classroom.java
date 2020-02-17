package com.kodilla.collections.adv.maps.homework;

public class Classroom {
    int numberOfStudents;
    String nameOfClass;

    public Classroom(int numberOfStudents, String nameOfClass) {
        this.numberOfStudents = numberOfStudents;
        this.nameOfClass = nameOfClass;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getNameOfClass() {
        return nameOfClass;
    }

    @Override
    public String toString() {
        return nameOfClass +
                " have " + numberOfStudents;
    }
}