package com.thymeleafexample.model.entity;

import com.thymeleafexample.model.dto.PilotDTO;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
@Builder
@Entity(name = "TB_PILOT")
public class PilotEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PILOT_ID")
    private Long id;
    @Column(name = "PILOT_BADGE")
    private String badge;
    @Column(name = "PILOT_PHONE_NUMBER")
    private String phoneNumber;
    @Column(name = "PILOT_NAME")
    private String name;

    public static PilotEntity buildEntity(PilotDTO pilot) {
        return PilotEntity.builder()
                .badge(pilot.getBadge())
                .phoneNumber(pilot.getPhoneNumber())
                .name(pilot.getName())
                .build();
    }

}
