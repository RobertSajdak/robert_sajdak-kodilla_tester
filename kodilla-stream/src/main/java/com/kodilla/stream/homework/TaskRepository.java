package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Nowak", 2020-01-15, 2020-01-31));
        tasks.add(new Task("Smith", 2020-02-11, 2020-02-29));
        tasks.add(new Task("White", 2020-01-02, 2020-02-22));
        tasks.add(new Task("Black", 2020-02-02, 2020-03-16));
        tasks.add(new Task("Callan", 2020-02-08, 2020-02-11));
        return tasks;
    }
}