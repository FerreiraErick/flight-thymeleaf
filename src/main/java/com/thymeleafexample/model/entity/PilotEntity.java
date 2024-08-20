package com.thymeleafexample.model.entity;

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
    private String id;
    @Column(name = "PILOT_PHONE_NUMBER")
    private String phoneNumber;
    @Column(name = "PILOT_NAME")
    private String name;

    public static PilotEntity buildEntity(PilotEntity pilot) {
        return PilotEntity.builder()
                .id(pilot.getId())
                .phoneNumber(pilot.getPhoneNumber())
                .name(pilot.getName())
                .build();
    }

}
