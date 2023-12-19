package Airline.reservation.System.Airlines.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BookingModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "flight_id")
    private FlightModel flight;

    @ManyToOne
    @JoinColumn(name = "passenger_id")
    private PassengerModel passenger;

    private Date bookingDate;
    private int numberOfSeats;

}
