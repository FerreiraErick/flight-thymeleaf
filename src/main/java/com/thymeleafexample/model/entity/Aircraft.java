package com.thymeleafexample.model.entity;

import javax.persistence.*;

@Entity(name = "TB_AIRCRAFT")
public class Aircraft {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "AIRCRAFT")
    private String aircraftId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAircraftId() {
        return aircraftId;
    }

    public void setAircraftId(String aircraftId) {
        this.aircraftId = aircraftId;
    }
}
