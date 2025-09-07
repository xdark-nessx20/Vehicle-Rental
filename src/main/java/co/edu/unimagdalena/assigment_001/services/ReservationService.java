package co.edu.unimagdalena.assigment_001.services;

import co.edu.unimagdalena.assigment_001.domine.entities.Reservation;
import co.edu.unimagdalena.assigment_001.domine.repositories.ReservationRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Optional;

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

    public Optional<Reservation> findReservationById(long id) {
        return reservationRepository.findById(id);
    }

    public List<Reservation> findAllReservations() {
        return reservationRepository.findAll();
    }

    public List<Reservation> findAllReservationsByStatus(String status) {
        return reservationRepository.findByStatus(status);
    }

    public List<Reservation> findAllReservationsByPriceGreaterThanEqual(BigDecimal price) {
        return reservationRepository.findByTotalPriceIsGreaterThanEqual(price);
    }

    public List<Reservation> findAllReservationsByPriceLessThanEqual(BigDecimal price) {
        return reservationRepository.findByTotalPriceIsLessThanEqual(price);
    }

    public List<Reservation> findAllReservationsByDateAndHourBetween(OffsetDateTime start, OffsetDateTime end) {
        return reservationRepository.findByPickupAtBetween(start, end);
    }

    public List<Reservation> findAllReservationsByDateBetween(LocalDate start, LocalDate end) {
        OffsetDateTime startDateTime = start.atStartOfDay().atOffset(ZoneOffset.UTC);
        OffsetDateTime endDateTime = end.plusDays(1).atStartOfDay().atOffset(ZoneOffset.UTC);

        return reservationRepository.findByPickupAtBetween(startDateTime, endDateTime);
    }

    @Transactional
    public void deleteReservationById(long id) {
        reservationRepository.deleteById(id);
    }

    @Transactional
    public void deleteAllReservations() {
        reservationRepository.deleteAll();
    }

    //There's no update logic yet
}
