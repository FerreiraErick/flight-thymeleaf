package com.thymeleafexample.model.dto;

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
public class PilotDTO {

    @NotNull
    @NotEmpty
    private String id;
    @NotNull
    @NotEmpty
    @Pattern(regexp = "\\(\\d{2}\\) \\d{5}-\\d{4}")
    private String phoneNumber;
    @NotNull
    @NotEmpty
    private String name;

}
