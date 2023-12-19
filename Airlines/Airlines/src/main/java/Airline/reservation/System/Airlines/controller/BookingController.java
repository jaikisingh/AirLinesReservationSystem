package Airline.reservation.System.Airlines.controller;

import Airline.reservation.System.Airlines.model.BookingModel;
import Airline.reservation.System.Airlines.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {
    @Autowired
    BookingService bookingService;

    @GetMapping
    public List<BookingModel> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @GetMapping("/{id}")
    public BookingModel getBookingById(@PathVariable Long id) {
        return bookingService.getBookingById(id);
    }
}
