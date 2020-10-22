package com.spingboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spingboot.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUsername(String username);

}
