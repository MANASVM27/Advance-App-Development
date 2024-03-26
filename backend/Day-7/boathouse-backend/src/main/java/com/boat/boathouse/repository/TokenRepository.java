package com.boat.boathouse.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boat.boathouse.model.Token;

public interface TokenRepository extends JpaRepository<Token, String> {
    List<Token> findAllByUser_IdAndExpiredFalseAndRevokedFalse(String email);

    Optional<Token> findByToken(String token);
}
