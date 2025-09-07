package co.edu.unimagdalena.assigment_001.domine.repositories;

import co.edu.unimagdalena.assigment_001.domine.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findByStatus(String status);
    List<Reservation> findByTotalPriceIsGreaterThanEqual(BigDecimal totalPriceIsGreaterThan);
    List<Reservation> findByTotalPriceIsLessThanEqual(BigDecimal totalPriceIsGreaterThan);

    //This method filters by date and hour
    List<Reservation> findByPickupAtBetween(OffsetDateTime pickupAtAfter, OffsetDateTime pickupAtBefore);

    //I don't know where these methods should be.
    List<Reservation> findByUser_Id(Long userId);
    List<Reservation> findByVehicle_Id(Long vehicleId);
}
