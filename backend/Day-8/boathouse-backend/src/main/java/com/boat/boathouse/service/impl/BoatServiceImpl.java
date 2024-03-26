// package com.haaris.boathouse.service.impl;

// import java.util.List;

// import org.apache.el.stream.Optional;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import java.util.Optional; 
// import com.haaris.boathouse.model.Boat;
// import com.haaris.boathouse.model.Passenger;
// import com.haaris.boathouse.repository.BoatRepository;
// import com.haaris.boathouse.service.BoatService;
// import com.haaris.boathouse.repository.PassengerRepository;

// @Service
// public class BoatServiceImpl implements BoatService {

//     @Autowired
//     private BoatRepository boatRepository;

//     @Autowired
//     private PassengerRepository passengerRepository;

//     @Override
//     public Boat saveBoat(Boat boat) {
//         // Save the boat
//         Boat savedBoat = boatRepository.save(boat);
        
//         // Check if there are passengers associated with the boat
//         List<Passenger> passengers = boat.getPassengers();
//         if (passengers != null && !passengers.isEmpty()) {
//             // Set the boat for each passenger and save them
//             for (Passenger passenger : passengers) {
//                 passenger.setBoat(savedBoat);
//             }
//             // Save all passengers
//             passengerRepository.saveAll(passengers);
//         }
        
//         return savedBoat;
//     }

//     @Override
//     public Boat updateBoat(int id, Boat boat) {
//         if (boatRepository.existsById(id)) {
//             boat.setBoatId(id);
//             return boatRepository.save(boat);
//         }
//         return null; // Or throw exception for not found
//     }

//     @Override
//     public Boat getBoatWithPassengersById(int id) {
//         Optional<Boat> optionalBoat = boatRepository.findById(id);
//         if (optionalBoat.isPresent()) {
//             Boat boat = optionalBoat.get();
//             // Load passenger details if available
//             if (boat.getPassengers() != null && !boat.getPassengers().isEmpty()) {
//                 for (Passenger passenger : boat.getPassengers()) {
//                     passenger.getName(); 
//                     // You can load other passenger details similarly if needed
//                 }
//             }
//             return boat;
//         }
//         return null;
//     }
    
//     @Override
//     public List<Boat> getAllBoats() {
//         return boatRepository.findAll();
//     }

//     @Override
//     public Boat findById(int id) {
//         return boatRepository.findById(id).orElse(null);
//     }
    
//     @Override
//     public void deleteBoat(int id) {
//         boatRepository.deleteById(id);
//     }
//     @Override
//     public List<Boat> findByFromAndCheckAndCheckOutAndRooms(String from, String check, String checkOut, int rooms) {
//     return boatRepository.findByFromAndCheckAndCheckOutAndRooms(from, check, checkOut, rooms);
// }
// @Override
// public List<Boat> findBoatsInFareRange(double minFare, double maxFare) {
//     return boatRepository.findByFareBetween(minFare, maxFare);
// }
// @Override
// public List<Boat> findBoatsByLowToHighFare() {
//     return boatRepository.findByOrderByFareAsc();
// }

// @Override
// public List<Boat> findBoatsByHighToLowFare() {
//     return boatRepository.findByOrderByFareDesc();
// }
// @Override
// public List<Boat> findBoatsByClass(String boatClass) {
//     return boatRepository.findByBoatClass(boatClass);
// }


// }


package com.boat.boathouse.service.impl;

import java.util.List;
import java.util.Optional; // Correct import

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boat.boathouse.model.Boat;
import com.boat.boathouse.model.Passenger;
import com.boat.boathouse.repository.BoatRepository;
import com.boat.boathouse.repository.PassengerRepository;
import com.boat.boathouse.service.BoatService;

@Service
public class BoatServiceImpl implements BoatService {

    @Autowired
    private BoatRepository boatRepository;

    @Autowired
    private PassengerRepository passengerRepository;
    

    @Override
        public List<Boat> getAllBoats() {
            return boatRepository.findAll();
        }
    
        @Override
        public Boat findById(int id) {
            return boatRepository.findById(id).orElse(null);
        }
        
        @Override
        public void deleteBoat(int id) {
            boatRepository.deleteById(id);
        }
        @Override
        public List<Boat> findByFromAndCheckAndCheckOutAndRooms(String from, String check, String checkOut, int rooms) {
        return boatRepository.findByFromAndCheckAndCheckOutAndRooms(from, check, checkOut, rooms);
    }
    @Override
    public List<Boat> findBoatsInFareRange(double minFare, double maxFare) {
        return boatRepository.findByFareBetween(minFare, maxFare);
    }
    @Override
    public List<Boat> findBoatsByLowToHighFare() {
        return boatRepository.findByOrderByFareAsc();
    }
    
    @Override
    public List<Boat> findBoatsByHighToLowFare() {
        return boatRepository.findByOrderByFareDesc();
    }
    @Override
    public List<Boat> findBoatsByClass(String boatClass) {
        return boatRepository.findByBoatClass(boatClass);
    }
    @Override
    public Boat saveBoat(Boat boat) {
        // Save the boat
        Boat savedBoat = boatRepository.save(boat);
        
        // Check if there are passengers associated with the boat
        List<Passenger> passengers = boat.getPassengers();
        if (passengers != null && !passengers.isEmpty()) {
            // Set the boat for each passenger and save them
            for (Passenger passenger : passengers) {
                passenger.setBoat(savedBoat);
            }
            // Save all passengers
            passengerRepository.saveAll(passengers);
        }
        
        return savedBoat;
    }

    @Override
    public Boat updateBoat(int id, Boat boat) {
        if (boatRepository.existsById(id)) {
            boat.setBoatId(id);
            return boatRepository.save(boat);
        }
        return null; // Or throw exception for not found
    }

    @Override
    public Boat getBoatWithPassengersById(int id) {
        Optional<Boat> optionalBoat = boatRepository.findById(id);
        if (optionalBoat.isPresent()) {
            Boat boat = optionalBoat.get();
            // Load passenger details if available
            if (boat.getPassengers() != null && !boat.getPassengers().isEmpty()) {
                for (Passenger passenger : boat.getPassengers()) {
                    passenger.getName(); // Trigger lazy loading if necessary
                    // You can load other passenger details similarly if needed
                }
            }
            return boat;
        }
        return null;
    }
    
    // Other methods...
}

