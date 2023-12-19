package Airline.reservation.System.Airlines.repository;

import Airline.reservation.System.Airlines.model.BookingModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepo extends JpaRepository<BookingModel,Long> {

}
