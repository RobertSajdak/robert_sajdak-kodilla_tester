package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {

        List<Flight> flightsRepository = new ArrayList<>();
        flightsRepository.add(new Flight("Warsaw", "Praha"));
        flightsRepository.add(new Flight("Budapest", "Vienna"));
        flightsRepository.add(new Flight("Munich", "London"));
        flightsRepository.add(new Flight("Roma", "Warsaw"));

        return flightsRepository;
    }
}