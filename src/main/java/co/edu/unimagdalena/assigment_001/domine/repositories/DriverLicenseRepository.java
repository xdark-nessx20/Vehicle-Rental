package co.edu.unimagdalena.assigment_001.domine.repositories;

import co.edu.unimagdalena.assigment_001.domine.entities.DriverLicense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverLicenseRepository extends JpaRepository<DriverLicense, Long> {
}
