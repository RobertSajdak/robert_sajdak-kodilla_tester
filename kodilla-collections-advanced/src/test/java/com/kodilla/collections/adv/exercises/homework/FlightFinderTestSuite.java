package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTestSuite {

    @Test
    public void testFindingFlightsFrom() {
        //given
        FlightFinder testDepartureFinder = new FlightFinder();
        //when
        List<Flight> resultDepartureList = testDepartureFinder.findFlightsFrom("Warsaw");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "Praha"));
        assertEquals(expectedList, resultDepartureList);
    }

    @Test
    public void testFindingFlightsTo() {
        //given
        FlightFinder testArrivalFinder = new FlightFinder();
        //when
        List<Flight> resultArrivalList = testArrivalFinder.findFlightsTo("London");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Munich", "London"));
        assertEquals(expectedList, resultArrivalList);
    }
}