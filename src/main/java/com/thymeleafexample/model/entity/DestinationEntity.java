package com.thymeleafexample.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "TB_DESTINATION")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DestinationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "DESTINATION_ID")
    private Long id;
    @Column(name = "DESTINATION_SHORT_NAME")
    private String shortName;
    @Column(name = "DESTINATION_DESCRIPTION")
    private String description;

}
