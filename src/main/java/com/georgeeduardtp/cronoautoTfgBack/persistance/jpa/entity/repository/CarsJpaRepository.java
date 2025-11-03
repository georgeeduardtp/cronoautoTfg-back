package com.georgeeduardtp.cronoautotfgback.persistance.jpa.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.georgeeduardtp.cronoautotfgback.persistance.jpa.entity.CarsEntity;

public interface CarsJpaRepository extends JpaRepository<CarsEntity, Long> {

}
