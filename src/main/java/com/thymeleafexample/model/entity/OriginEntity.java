package com.thymeleafexample.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "TB_ORIGIN")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OriginEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ORIGIN_ID")
    private Long id;
    @Column(name = "ORIGIN_SHORT_NAME")
    private String shortName;
    @Column(name = "ORIGIN_DESCRIPTION")
    private String description;

}
