package com.thymeleafexample.repository;

import com.thymeleafexample.model.entity.AircraftEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AircraftRepository extends JpaRepository<AircraftEntity, Long> {



}
