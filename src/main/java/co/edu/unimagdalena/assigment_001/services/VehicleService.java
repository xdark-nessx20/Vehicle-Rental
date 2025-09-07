package co.edu.unimagdalena.assigment_001.services;

import co.edu.unimagdalena.assigment_001.domine.entities.Vehicle;
import co.edu.unimagdalena.assigment_001.domine.repositories.VehicleRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {
    private final VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public List<Vehicle> findAllVehicles() {
        return vehicleRepository.findAll();
    }

    public Optional<Vehicle> findVehicleById(long id) {
        return vehicleRepository.findById(id);
    }

    public Optional<Vehicle> findVehicleByPlate(String plate) {
        return vehicleRepository.findByPlate(plate);
    }

    public List<Vehicle> findVehicleByBrand(String brand) {
        return vehicleRepository.findByBrand(brand);
    }

    public List<Vehicle> findVehicleByModelAndYear(String model, Integer year) {
        return vehicleRepository.findByModelAndYear(model, year);
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

    //There's no update logic yet
}
