package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Nowak", LocalDate.of(2020,1,15), LocalDate.of(2020,3,22)));
        tasks.add(new Task("Smith", LocalDate.of(2020,2,22), LocalDate.of(2020,4,5)));
        tasks.add(new Task("White", LocalDate.of(2020,4,3), LocalDate.of(2020,4,12)));
        tasks.add(new Task("Black", LocalDate.of(2020,5,6), LocalDate.of(2020,6,8)));
        tasks.add(new Task("Callan", LocalDate.of(2020,7,30), LocalDate.of(2020,9,4)));
        return tasks;
    }
}