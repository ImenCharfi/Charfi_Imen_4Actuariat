package tn.esprit.Charfi_Imen_4Actuariat.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Charfi_Imen_4Actuariat.entities.Reservation;
import tn.esprit.Charfi_Imen_4Actuariat.service.interfaces.IReservationService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationRestController {

    IReservationService reservationService;

    // http://localhost:8081/reservation/retrieve-all-reservations
    @GetMapping("/retrieve-all-reservations")
    public Set<Reservation> getReservations() {
        return reservationService.retrieveAllReservations();
    }

    // http://localhost:8081/reservation/retrieve-reservation/1
    @GetMapping("/retrieve-reservation/{reservation-id}")
    public Reservation retrieveReservation(@PathVariable("reservation-id") Long reservationId) {
        return reservationService.retrieveReservation(reservationId);
    }

    // http://localhost:8081/reservation/add-reservation
    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation r) {
        return reservationService.addReservation(r);
    }

    // http://localhost:8081/reservation/modify-reservation
    @PutMapping("/modify-reservation")
    public Reservation modifyReservation(@RequestBody Reservation r) {
        return reservationService.updateReservation(r);
    }

    // http://localhost:8081/reservation/remove-reservation/1
    @DeleteMapping("/remove-reservation/{reservation-id}")
    public void removeReservation(@PathVariable("reservation-id") Long reservationId) {
        reservationService.deleteReservation(reservationId);
    }
}