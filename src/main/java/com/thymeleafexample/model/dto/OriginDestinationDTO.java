package com.thymeleafexample.model.dto;

import com.thymeleafexample.model.entity.DestinationEntity;
import com.thymeleafexample.model.entity.OriginEntity;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OriginDestinationDTO {

    private Long id;
    private String shortName;

    public static OriginDestinationDTO originDestinationDTO (OriginEntity origin) {
        return OriginDestinationDTO.builder()
                .id(origin.getId())
                .shortName(origin.getShortName())
                .build();
    }

    public static OriginDestinationDTO originDestinationDTO (DestinationEntity origin) {
        return OriginDestinationDTO.builder()
                .id(origin.getId())
                .shortName(origin.getShortName())
                .build();
    }
    
}
