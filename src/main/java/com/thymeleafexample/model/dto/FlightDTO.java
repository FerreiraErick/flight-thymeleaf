package com.thymeleafexample.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FlightDTO {

    @NotNull
    @NotEmpty
    private String aircraft;
    @NotNull
    @NotEmpty
    private String pilot;
    @NotNull
    @NotEmpty
    private String origin;
    @NotNull
    @NotEmpty
    private String destination;
    @NotNull
    @NotEmpty
    private LocalDateTime riseDate;
    @NotNull
    @NotEmpty
    private LocalDateTime arriveDate;


}
