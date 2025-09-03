package co.edu.unimagdalena.assigment_001.services;

import co.edu.unimagdalena.assigment_001.entities.Vehicle;
import co.edu.unimagdalena.assigment_001.services.repositories.VehicleRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VehicleService {
    private final VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public List<Vehicle> findAllVehicles() {
        return vehicleRepository.findAll();
    }

    public Vehicle findVehicleById(long id) {
        return vehicleRepository.findById(id).orElse(null);
    }

    @Transactional
    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Transactional
    public List<Vehicle> saveAllVehicles(List<Vehicle> vehicles) {
        return vehicleRepository.saveAll(vehicles);
    }

    @Transactional
    public void deleteVehicleById(long id) {
        vehicleRepository.deleteById(id);
    }

    @Transactional
    public void deleteAllVehicles() {
        vehicleRepository.deleteAll();
    }
}
