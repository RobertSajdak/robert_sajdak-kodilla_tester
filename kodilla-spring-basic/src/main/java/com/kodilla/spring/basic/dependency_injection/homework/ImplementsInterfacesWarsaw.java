package com.kodilla.spring.basic.dependency_injection.homework;

public class ImplementsInterfacesWarsaw implements DeliveryService, NotificationService {

    public void deliverPackage(String address, double weight) {
        System.out.println("Delivery [" + address + "], weight: " + weight + " in Warsaw");
    }

    static void success(String address) {
        System.out.println("Package delivered to: " + address);
    }

    static void fail(String address) {
        System.out.println("Package not delivered to: " + address);
    }
}