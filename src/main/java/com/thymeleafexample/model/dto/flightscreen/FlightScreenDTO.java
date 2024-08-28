package com.thymeleafexample.model.dto.flightscreen;

import com.thymeleafexample.model.dto.AircraftDTO;
import com.thymeleafexample.model.dto.OriginDestinationDTO;
import com.thymeleafexample.model.dto.PilotDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FlightScreenDTO {

    private List<AircraftDTO> aircraftList;
    private List<PilotDTO> pilotList;
    private List<OriginDestinationDTO> origin;
    private List<OriginDestinationDTO> destination;

}
