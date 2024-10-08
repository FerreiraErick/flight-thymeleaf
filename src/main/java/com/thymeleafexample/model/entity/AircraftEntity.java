package com.thymeleafexample.model.entity;

import com.thymeleafexample.model.dto.AircraftDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity(name = "TB_AIRCRAFT")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AircraftEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AIRCRAFT_ID")
    private Long id;
    @Column(name = "AIRCRAFT_BRAND")
    private String brand;
    @Column(name = "AIRCRAFT_MODEL")
    private String model;
    @Column(name = "AIRCRAFT_BADGE")
    private String badge;

    public static AircraftEntity buildEntity(AircraftDTO aircraft) {
        return AircraftEntity.builder()
                .brand(aircraft.getAircraftBrand())
                .model(aircraft.getAircraftModel())
                .badge(aircraft.getAircraftBadge())
                .build();
    }

}
