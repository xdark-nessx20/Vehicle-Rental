package co.edu.unimagdalena.assigment_001.repositories;

import co.edu.unimagdalena.assigment_001.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
