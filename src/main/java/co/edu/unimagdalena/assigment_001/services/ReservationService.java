package co.edu.unimagdalena.assigment_001.services;

import co.edu.unimagdalena.assigment_001.domine.entities.Reservation;
import co.edu.unimagdalena.assigment_001.domine.repositories.ReservationRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReservationService {
    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Transactional
    public Reservation saveReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Transactional
    public List<Reservation> saveAllReservations(List<Reservation> reservations) {
        return reservationRepository.saveAll(reservations);
    }

    public Reservation findReservationById(long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    public List<Reservation> findAllReservations() {
        return reservationRepository.findAll();
    }

    @Transactional
    public void deleteReservationById(long id) {
        reservationRepository.deleteById(id);
    }

    @Transactional
    public void deleteAllReservations() {
        reservationRepository.deleteAll();
    }
}
