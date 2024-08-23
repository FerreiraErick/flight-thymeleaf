package com.thymeleafexample.service;

import com.thymeleafexample.model.dto.AircraftDTO;
import com.thymeleafexample.model.dto.FlightDTO;
import com.thymeleafexample.model.dto.PilotDTO;
import com.thymeleafexample.model.dto.flightscreen.FlightScreenDTO;

public interface FlightComponentsRepositoryServiceInterface {

    void createAircraft(AircraftDTO aircraft);
    void createPilot(PilotDTO pilotDTO);
    void createFlight(FlightDTO flightDTO);
    FlightScreenDTO fetchFlightScreenData();
}
