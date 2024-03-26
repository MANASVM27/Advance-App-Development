package com.boat.boathouse.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boat.boathouse.model.User;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);
}
