package com.spingboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spingboot.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

}
