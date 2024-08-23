package com.thymeleafexample.repository;

import com.thymeleafexample.model.entity.OriginEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OriginRepository extends JpaRepository<OriginEntity, Long> {
}
