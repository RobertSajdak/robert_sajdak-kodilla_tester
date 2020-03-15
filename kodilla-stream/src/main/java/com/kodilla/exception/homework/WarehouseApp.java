package com.kodilla.exception.homework;

public class WarehouseApp {

    public static void main(String[] args) throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1/2020"));
        warehouse.addOrder(new Order("2/2020"));
        warehouse.addOrder(new Order("3/2020"));
        warehouse.addOrder(new Order("4/2020"));

        try {
            warehouse.getOrder("5/2020");
        } catch (OrderDoesntExistException e) {
            System.out.println("Sorry, we can't find your order");
        } finally {
            System.out.println("Thank you for using our services");
        }
        System.out.println(warehouse.getSize());
    }
}