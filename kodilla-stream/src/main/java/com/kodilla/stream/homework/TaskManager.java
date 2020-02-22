package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> deadline = TaskRepository.getTasks();
    }
}
