package com.thymeleafexample.repository;

import com.thymeleafexample.model.Flight;

import java.util.ArrayList;
import java.util.List;

public interface FlightRepository {

    static List<Flight> getFlights() {

        List<Flight> flights = new ArrayList<>();

        Flight flight1 = new Flight();

        flights.add(flight1);

        return flights;
    }
}
