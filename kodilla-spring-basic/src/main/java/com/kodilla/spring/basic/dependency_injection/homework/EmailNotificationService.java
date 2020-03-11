package com.kodilla.spring.basic.dependency_injection.homework;

public class EmailNotificationService implements NotificationService {
    @Override
    public String success(String address) {
        System.out.println("Sending an e-mail: Package delivered to: " + address);
        return address;
    }

    @Override
    public String fail(String address) {
        System.out.println("Sending an e-mail: Package not delivered to: " + address);
        return address;
    }
}