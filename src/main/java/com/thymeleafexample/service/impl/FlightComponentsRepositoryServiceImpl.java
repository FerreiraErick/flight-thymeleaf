package com.thymeleafexample.service.impl;

import com.thymeleafexample.model.dto.AircraftDTO;
import com.thymeleafexample.model.entity.AircraftEntity;
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
        AircraftEntity aircraftEntity = AircraftEntity.buildEntity(aircraft);
        aircraftRepository.save(aircraftEntity);
    }
}
