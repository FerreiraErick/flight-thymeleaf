package com.thymeleafexample.model.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AircraftDTO {

    @NotNull
    @NotEmpty
    private String aircraftModel;
    @NotNull
    @NotEmpty
    private String aircraftId;

    public String getAircraftModel() {
        return aircraftModel;
    }

    public void setAircraftModel(String aircraftModel) {
        this.aircraftModel = aircraftModel;
    }

    public String getAircraftId() {
        return aircraftId;
    }

    public void setAircraftId(String aircraftId) {
        this.aircraftId = aircraftId;
    }


    @Override
    public String toString() {
        return "AircraftDTO{" +
                "aircraftModel='" + aircraftModel + '\'' +
                ", aircraftId='" + aircraftId + '\'' +
                '}';
    }
}
