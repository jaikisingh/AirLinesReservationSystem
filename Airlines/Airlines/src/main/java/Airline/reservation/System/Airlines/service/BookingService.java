package Airline.reservation.System.Airlines.service;

import Airline.reservation.System.Airlines.model.BookingModel;
import Airline.reservation.System.Airlines.repository.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    @Autowired
    BookingRepo bookingRepo;

    public List<BookingModel> getAllBookings() {
        return bookingRepo.findAll();
    }

    public BookingModel getBookingById(Long id) {
        return bookingRepo.findById(id).orElse(null);
    }
}
