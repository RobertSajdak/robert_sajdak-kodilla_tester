package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static List<Student> main(String[] args) {
        List<Student> students = new ArrayList<>();
            students.add(new Student("Jan Kowalski", null));


        return students;
    }
}
