package co.edu.unimagdalena.assigment_001.services;

import co.edu.unimagdalena.assigment_001.domine.entities.DriverLicense;
import co.edu.unimagdalena.assigment_001.domine.repositories.DriverLicenseRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class DriverLicenseService {
    private final DriverLicenseRepository driverLicenseRepository;

    public DriverLicenseService(DriverLicenseRepository driverLicenseRepository) {
        this.driverLicenseRepository = driverLicenseRepository;
    }

    @Transactional
    public DriverLicense saveDriverLicense(DriverLicense driverLicense) {
        return driverLicenseRepository.save(driverLicense);
    }

    @Transactional
    public List<DriverLicense> saveAllDriverLicenses(List<DriverLicense> driverLicenses) {
        return driverLicenseRepository.saveAll(driverLicenses);
    }

    public List<DriverLicense> findAllDriverLicenses() {
        return driverLicenseRepository.findAll();
    }

    public Optional<DriverLicense> findDriverLicenseById(Long id) {
        return driverLicenseRepository.findById(id);
    }

    public Optional<DriverLicense> findDriverLicenseByLicenseNumber(String licenseNumber) {
        return driverLicenseRepository.findByLicenseNumber(licenseNumber);
    }

    public List<DriverLicense> findAllDriverLicensesByCategory(String category) {
        return driverLicenseRepository.findByCategory(category);
    }

    public List<DriverLicense> findAllDriverLicensesByIssuedAtBetween(LocalDate issuedAtAfter, LocalDate issuedAtBefore) {
        return driverLicenseRepository.findByIssuedAtBetween(issuedAtAfter, issuedAtBefore);
    }

    public List<DriverLicense> findAllDriverLicensesByExpiresAtBetween(LocalDate issuedAtAfter, LocalDate issuedAtBefore) {
        return driverLicenseRepository.findByExpiresAtBetween(issuedAtAfter, issuedAtBefore);
    }

    @Transactional
    public void deleteDriverLicenseById(Long id) {
        driverLicenseRepository.deleteById(id);
    }

    @Transactional
    public void deleteAllDriverLicenses() {
        driverLicenseRepository.deleteAll();
    }

    //There's no update logic yet
}
