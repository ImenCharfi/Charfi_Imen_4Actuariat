package tn.esprit.Charfi_Imen_4Actuariat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.Charfi_Imen_4Actuariat.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
