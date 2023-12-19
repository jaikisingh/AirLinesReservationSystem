package Airline.reservation.System.Airlines.service;

import Airline.reservation.System.Airlines.model.FlightModel;
import Airline.reservation.System.Airlines.repository.FlightRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {
    @Autowired
    FlightRepo flightRepo;

    public List<FlightModel> getAllFlights() {
        return flightRepo.findAll();
    }

    public FlightModel getFlightById(Long id) {
        return flightRepo.findById(id).orElse(null);
    }

}
