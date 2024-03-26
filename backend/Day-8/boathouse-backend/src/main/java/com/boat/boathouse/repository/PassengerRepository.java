package com.boat.boathouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boat.boathouse.model.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {
    // Define custom query methods if needed
}
