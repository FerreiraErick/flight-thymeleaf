package com.thymeleafexample.model.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity(name = "TB_FLIGHT")
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

    public Flight() { }

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public AircraftEntity getAircraft() {
        return aircraftEntity;
    }

    public void setAircraft(AircraftEntity aircraftEntity) {
        this.aircraftEntity = aircraftEntity;
    }

    public LocalTime getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(LocalTime flightTime) {
        this.flightTime = flightTime;
    }

    public LocalDate getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(LocalDate flightDate) {
        this.flightDate = flightDate;
    }

    public String getDestinationFrom() {
        return destinationFrom;
    }

    public void setDestinationFrom(String destinationFrom) {
        this.destinationFrom = destinationFrom;
    }

    public String getDestinationTo() {
        return destinationTo;
    }

    public void setDestinationTo(String destinationTo) {
        this.destinationTo = destinationTo;
    }
}
