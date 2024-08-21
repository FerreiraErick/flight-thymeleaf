package com.thymeleafexample.model.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

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

}
