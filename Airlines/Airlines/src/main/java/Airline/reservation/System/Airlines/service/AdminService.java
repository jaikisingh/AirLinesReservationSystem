package Airline.reservation.System.Airlines.service;

import Airline.reservation.System.Airlines.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    AdminRepo adminRepo;
}
