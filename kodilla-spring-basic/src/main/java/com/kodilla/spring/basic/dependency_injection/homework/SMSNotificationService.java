package com.kodilla.spring.basic.dependency_injection.homework;

public class SMSNotificationService implements NotificationService {

    @Override
    public String success(String address) {
        System.out.println("Sending a text message: Package delivered to: " + address);
        return address;
    }

    @Override
    public String fail(String address) {
        System.out.println("Sending a text message: Package not delivered to: " + address);
        return address;
    }
}