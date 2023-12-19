package Airline.reservation.System.Airlines.controller;

import Airline.reservation.System.Airlines.model.FlightModel;
import Airline.reservation.System.Airlines.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flight")
public class FlightController {
    @Autowired
    FlightService flightService;

    @GetMapping
    public List<FlightModel> getAllFlights() {
        return flightService.getAllFlights();
    }

    @GetMapping("/{id}")
    public FlightModel getFlightById(@PathVariable Long id) {
        return flightService.getFlightById(id);
    }

}
