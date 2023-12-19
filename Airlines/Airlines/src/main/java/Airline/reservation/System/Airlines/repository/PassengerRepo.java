package Airline.reservation.System.Airlines.repository;

import Airline.reservation.System.Airlines.model.PassengerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepo extends JpaRepository<PassengerModel,Long> {
}
