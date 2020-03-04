package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        DeliveryService deliveryService = new ImplementsInterfacesWarsaw();
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService);

        NotificationService notificationService = new ImplementsInterfacesWarsaw();
        ShippingCenter shippingCenter_1 = new ShippingCenter(notificationService);

        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
    }
}