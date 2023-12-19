package Airline.reservation.System.Airlines.controller;

import Airline.reservation.System.Airlines.model.PassengerModel;
import Airline.reservation.System.Airlines.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/passenger")
public class PassengerController {
@Autowired
PassengerService passengerService;

    @GetMapping
    public List<PassengerModel> getAllPassengers() {
        return passengerService.getAllPassengers();
    }

    @GetMapping("/{id}")
    public PassengerModel getPassengerById(@PathVariable Long id) {
        return passengerService.getPassengerById(id);
    }

}
