package co.edu.unimagdalena.assigment_001.domine.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "vehicles")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "vehicle_id")
    private Long id;

    @Column(nullable = false, unique = true)
    private String plate;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private Integer year;

    @Column(nullable = false)
    private String status;

    @OneToMany(mappedBy = "vehicle", fetch = FetchType.LAZY)
    private List<Reservation> reservations;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "station_id")
    private Station station;

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
        reservation.setVehicle(this);
    }
}
