package com.thymeleafexample.repository;

import com.thymeleafexample.model.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Double> {

}
