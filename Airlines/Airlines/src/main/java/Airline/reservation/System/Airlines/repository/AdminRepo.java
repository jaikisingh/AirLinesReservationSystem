package Airline.reservation.System.Airlines.repository;

import Airline.reservation.System.Airlines.model.AdminModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface AdminRepo extends JpaRepository<AdminModel,Long> {
}
