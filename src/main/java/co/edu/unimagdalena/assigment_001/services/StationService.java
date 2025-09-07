package co.edu.unimagdalena.assigment_001.services;

import co.edu.unimagdalena.assigment_001.domine.entities.Station;
import co.edu.unimagdalena.assigment_001.domine.repositories.StationRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class StationService {
    private final StationRepository stationRepository;

    public StationService(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    public List<Station> findAllStations() {
        return stationRepository.findAll();
    }

    public Optional<Station> findStationById(int id) {
        return stationRepository.findById(id);
    }

    public List<Station> findAllStationsByCity(String city) {
        return stationRepository.findByCity(city);
    }

    @Transactional
    public Station saveStation(Station station) {
        return stationRepository.save(station);
    }

    @Transactional
    public List<Station> saveAllStations(List<Station> stations) {
        return stationRepository.saveAll(stations);
    }

    @Transactional
    public void deleteStation(Station station) {
        stationRepository.delete(station);
    }

    @Transactional
    public void deleteAllStations() {
        stationRepository.deleteAll();
    }

    //There's no update logic yet

}
