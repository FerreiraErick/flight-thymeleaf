package com.thymeleafexample.service.impl;

import com.thymeleafexample.model.dto.AircraftDTO;
import com.thymeleafexample.model.dto.FlightDTO;
import com.thymeleafexample.model.dto.PilotDTO;
import com.thymeleafexample.model.dto.flightscreen.FlightScreenDTO;
import com.thymeleafexample.model.entity.AircraftEntity;
import com.thymeleafexample.model.entity.PilotEntity;
import com.thymeleafexample.repository.*;
import com.thymeleafexample.service.FlightComponentsRepositoryServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FlightComponentsRepositoryServiceImpl implements FlightComponentsRepositoryServiceInterface {

    private final AircraftRepository aircraftRepository;
    private final PilotRepository pilotRepository;
    private final FlightRepository flightRepository;
    private final OriginRepository originRepository;
    private final DestinationRepository destinationRepository;

    @Override
    public void createAircraft(AircraftDTO aircraft) {
        AircraftEntity aircraftEntity = AircraftEntity.buildEntity(aircraft);
        aircraftRepository.save(aircraftEntity);
    }

    @Override
    public void createPilot(PilotDTO pilotDTO) {
        PilotEntity pilotEntity = PilotEntity.buildEntity(pilotDTO);
        pilotRepository.save(pilotEntity);
    }

    @Override
    public void createFlight(FlightDTO flightDTO) {

    }

    @Override
    public FlightScreenDTO fetchFlightScreenData() {
        FlightScreenDTO flightScreenDTO = new FlightScreenDTO();
        flightScreenDTO.setAircraftList(aircraftRepository.findAll().ma);


        return null;
    }

}
