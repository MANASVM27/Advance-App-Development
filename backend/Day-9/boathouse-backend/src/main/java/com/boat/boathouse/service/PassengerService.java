package com.boat.boathouse.service;

import java.util.List;

import com.boat.boathouse.model.Passenger;

public interface PassengerService {
    Passenger savePassenger(Passenger passenger);

    List<Passenger> getAllPassengers();

    Passenger getPassengerById(Long id);

    void deletePassengerById(Long id);

    Passenger getPassengerWithBoatDetailsById(Long id);

}
