package com.learnsecurity.repository;

import java.util.Optional;

import com.learnsecurity.models.ERole;
import com.learnsecurity.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}