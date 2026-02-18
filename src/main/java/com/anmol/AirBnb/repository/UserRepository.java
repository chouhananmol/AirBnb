package com.anmol.AirBnb.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anmol.AirBnb.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByEmail(String email);
}
