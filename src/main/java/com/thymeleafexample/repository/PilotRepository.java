package com.thymeleafexample.repository;

import com.thymeleafexample.model.entity.PilotEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PilotRepository extends JpaRepository<PilotEntity, Long> {
}
