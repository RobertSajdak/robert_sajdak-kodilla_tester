package com.kodilla.collections.adv.immutable.homework;

public final class Task {
    protected final String title;
    protected final int duration;

    private Task(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    private final String getTitle() {
        return title;
    }

    private final int getDuration() {
        return duration;
    }
}