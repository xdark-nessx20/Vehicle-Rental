package co.edu.unimagdalena.assigment_001.domine.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Entity
@Table(name = "stations")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "station_id")
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String address;

    @OneToMany(mappedBy = "station", fetch = FetchType.EAGER)
    private Set<Vehicle> vehicles;

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        vehicle.setStation(this);
    }
}
