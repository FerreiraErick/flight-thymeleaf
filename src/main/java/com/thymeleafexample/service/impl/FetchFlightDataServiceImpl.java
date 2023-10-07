package com.thymeleafexample.service.impl;


import com.thymeleafexample.model.entity.Flight;
import com.thymeleafexample.repository.FlightRepository;
import com.thymeleafexample.service.FetchFlightDataInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FetchFlightDataServiceImpl implements FetchFlightDataInterface {
    private static final Logger LOGGER = LoggerFactory.getLogger(FetchFlightDataServiceImpl.class);

    @Autowired
    private FlightRepository flightRepository;

    @Override
    public List<Flight> fetch() {
        LOGGER.info("Fetching flight data");
        return flightRepository.findAll();
    }
}
