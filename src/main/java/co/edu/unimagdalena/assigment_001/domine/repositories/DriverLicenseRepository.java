package co.edu.unimagdalena.assigment_001.domine.repositories;

import co.edu.unimagdalena.assigment_001.domine.entities.DriverLicense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface DriverLicenseRepository extends JpaRepository<DriverLicense, Long> {
    Optional<DriverLicense> findByLicenseNumber(String driverLicenseNumber);

    List<DriverLicense> findByCategory(String category);
    List<DriverLicense> findByIssuedAtBetween(LocalDate issuedAtAfter, LocalDate issuedAtBefore);
    List<DriverLicense> findByExpiresAtBetween(LocalDate issuedAtAfter, LocalDate issuedAtBefore);

    //I don't know if this method should be either UserRepository or here
    Optional<DriverLicense> findByUser_Id(Long userId);
}
