package co.edu.unimagdalena.assigment_001.services;

import co.edu.unimagdalena.assigment_001.entities.Station;
import co.edu.unimagdalena.assigment_001.repositories.StationRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StationService {
    private final StationRepository stationRepository;

    public StationService(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    public List<Station> findAllStations() {
        return stationRepository.findAll();
    }

    public Station findStationById(int id) {
        return stationRepository.findById(id).orElse(null);
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

}
