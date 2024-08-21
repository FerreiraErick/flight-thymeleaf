package com.thymeleafexample.service;

import com.thymeleafexample.model.dto.AircraftDTO;
import com.thymeleafexample.model.dto.PilotDTO;

public interface FlightComponentsRepositoryServiceInterface {

    public void createAircraft(AircraftDTO aircraft);
    public void createPilot(PilotDTO pilotDTO);

}
