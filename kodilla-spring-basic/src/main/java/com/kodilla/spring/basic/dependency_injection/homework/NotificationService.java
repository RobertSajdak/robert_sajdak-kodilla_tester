package com.kodilla.spring.basic.dependency_injection.homework;

public interface NotificationService {

    static void success(String address) {
        System.out.println("Package delivered to: " + address);
    }

    static void fail(String address) {
        System.out.println("Package not delivered to: " + address);
    }
}