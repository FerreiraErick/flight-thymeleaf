package com.thymeleafexample.service.impl;

import com.thymeleafexample.model.dto.AircraftDTO;
import com.thymeleafexample.model.entity.Aircraft;
import com.thymeleafexample.repository.AircraftRepository;
import com.thymeleafexample.service.FlightComponentsRepositoryServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FlightComponentsRepositoryServiceImpl implements FlightComponentsRepositoryServiceInterface {

    private final AircraftRepository aircraftRepository;

    @Override
    public void buildAircraft(AircraftDTO aircraft) {
        Aircraft aircraftEntity = Aircraft.buildEntity(aircraft);
        aircraftRepository.save(aircraftEntity);
    }
}
