package com.thymeleafexample.model;

import javax.persistence.*;

@Entity(name = "TB_AIRCRAFT")
public class Aircraft {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "AIRCRAFT_SERIAL_NUMBER")
    private String airCraftSerialNumber;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAirCraftSerialNumber() {
        return airCraftSerialNumber;
    }

    public void setAirCraftSerialNumber(String airCraftSerialNumber) {
        this.airCraftSerialNumber = airCraftSerialNumber;
    }
}
