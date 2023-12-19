package Airline.reservation.System.Airlines.service;

import Airline.reservation.System.Airlines.model.PassengerModel;
import Airline.reservation.System.Airlines.repository.PassengerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {
    @Autowired
    PassengerRepo passengerRepo;

    public List<PassengerModel> getAllPassengers() {
        return passengerRepo.findAll();
    }

    public PassengerModel getPassengerById(Long id) {
        return passengerRepo.findById(id).orElse(null);
    }
}
