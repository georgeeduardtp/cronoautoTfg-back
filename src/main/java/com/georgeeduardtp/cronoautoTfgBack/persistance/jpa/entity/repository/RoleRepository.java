package com.georgeeduardtp.cronoautotfgback.persistance.jpa.entity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.georgeeduardtp.cronoautotfgback.models.ERole;
import com.georgeeduardtp.cronoautotfgback.models.Role;



@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
  Optional<Role> findByName(ERole name);
}