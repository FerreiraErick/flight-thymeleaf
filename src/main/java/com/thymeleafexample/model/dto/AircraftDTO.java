package com.thymeleafexample.model.dto;

import com.thymeleafexample.model.entity.AircraftEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AircraftDTO {

    @NotNull
    @NotEmpty
    private String aircraftModel;
    @NotNull
    @NotEmpty
    private String aircraftBrand;
    @NotNull
    @NotEmpty
    @Pattern(regexp = "[A-Z]*-[0-9]*")
    private String aircraftBadge;

    public static AircraftDTO toDTO(AircraftEntity aircraftEntity) {
        return AircraftDTO.builder()
                .aircraftBadge(aircraftEntity.getBadge())
                .aircraftModel(aircraftEntity.getModel())
                .aircraftBrand(aircraftEntity.getBrand())
                .build();
    }

}
