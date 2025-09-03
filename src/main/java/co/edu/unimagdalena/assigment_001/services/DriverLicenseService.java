package co.edu.unimagdalena.assigment_001.services;

import co.edu.unimagdalena.assigment_001.entities.DriverLicense;
import co.edu.unimagdalena.assigment_001.repositories.DriverLicenseRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public DriverLicense findDriverLicenseById(Long id) {
        return driverLicenseRepository.findById(id).orElse(null);
    }

    @Transactional
    public void deleteDriverLicenseById(Long id) {
        driverLicenseRepository.deleteById(id);
    }

    @Transactional
    public void deleteAllDriverLicenses() {
        driverLicenseRepository.deleteAll();
    }
}
