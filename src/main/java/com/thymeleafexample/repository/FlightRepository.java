package com.thymeleafexample.repository;

import com.thymeleafexample.model.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Double> {

    static List<Flight> getFlights() {

        List<Flight> flights = new ArrayList<>();

        Flight flight1 = new Flight();

        flights.add(flight1);

        return flights;
    }
}
