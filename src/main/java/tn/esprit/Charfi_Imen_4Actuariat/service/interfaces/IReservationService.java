package tn.esprit.Charfi_Imen_4Actuariat.service.interfaces;

import tn.esprit.Charfi_Imen_4Actuariat.entities.Reservation;
import java.util.Set;

public interface IReservationService {
    Reservation addReservation(Reservation reservation);
    Reservation updateReservation(Reservation reservation);
    void deleteReservation(Long id);
    Reservation retrieveReservation(Long id);
    Set<Reservation> retrieveAllReservations();
}