package Airline.reservation.System.Airlines.repository;

import Airline.reservation.System.Airlines.model.FlightModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FlightRepo extends JpaRepository<FlightModel, Long> {

}

