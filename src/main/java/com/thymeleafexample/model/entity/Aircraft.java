package com.thymeleafexample.model.entity;

import com.thymeleafexample.model.dto.AircraftDTO;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity(name = "TB_AIRCRAFT")
@Data
@Builder
public class Aircraft {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "AIRCRAFT_BRAND")
    private String aircraftBrand;
    @Column(name = "AIRCRAFT_MODEL")
    private String aircraftModel;
    @Column(name = "AIRCRAFT_BADGE")
    private String aircraftBadge;

    public static Aircraft buildEntity(AircraftDTO aircraft) {
        return Aircraft.builder()
                .aircraftBrand(aircraft.getAircraftBrand())
                .aircraftModel(aircraft.getAircraftModel())
                .aircraftBadge(aircraft.getAircraftBadge())
                .build();
    }

}
