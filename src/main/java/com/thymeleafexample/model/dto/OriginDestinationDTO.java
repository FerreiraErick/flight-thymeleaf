package com.thymeleafexample.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OriginDestinationDTO {

    private Long id;
    private String shortName;
    
}
