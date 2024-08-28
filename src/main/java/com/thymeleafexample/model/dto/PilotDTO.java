package com.thymeleafexample.model.dto;

import com.thymeleafexample.model.entity.PilotEntity;
import lombok.*;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PilotDTO {

    @NotNull
    @NotEmpty
    @Pattern(regexp = "[A-Z]*-[0-9]*")
    private String badge;
    @NotNull
    @NotEmpty
    @Pattern(regexp = "\\(\\d{2}\\) \\d{5}-\\d{4}")
    private String phoneNumber;
    @NotNull
    @NotEmpty
    private String name;

    public static PilotDTO toPilotDTO(PilotEntity pilot) {
        return PilotDTO.builder()
                .name(pilot.getName())
                .badge(pilot.getBadge())
                .phoneNumber(pilot.getPhoneNumber())
                .build();
    }

}
