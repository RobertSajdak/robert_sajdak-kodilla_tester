package com.kodilla.exception.homework;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class WarehouseTestSuite {

    @Test
    public void testOrderExists() throws OrderDoesntExistException{
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("2/2020"));
        //when
        Order result = warehouse.getOrder("2/2020");
        //then
        assertEquals(new Order("2/2020"), result);
    }

    @Test (expected = OrderDoesntExistException.class)
    public void testOrderExists_withException() throws OrderDoesntExistException{
        //given
        Warehouse warehouse = new Warehouse();
        //when
        Order result = warehouse.getOrder("288/2020");
    }
}