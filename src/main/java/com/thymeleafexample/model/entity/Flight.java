package com.thymeleafexample.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity(name = "TB_FLIGHT")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Double id;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "AIRCRAFT_ID", referencedColumnName = "AIRCRAFT_ID")
    private AircraftEntity aircraftEntity;
    @Column(name = "FLIGHT_TIME")
    private LocalTime flightTime;
    @Column(name = "FLIGHT_DATE")
    private LocalDate flightDate;
    @Column(name = "DESTINATION_FROM")
    private String destinationFrom;
    @Column(name = "DESTINATION_TO")
    private String destinationTo;


}
