package com.thymeleafexample.repository;

import com.thymeleafexample.model.entity.DestinationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinationRepository extends JpaRepository<DestinationEntity, Long> {
}
