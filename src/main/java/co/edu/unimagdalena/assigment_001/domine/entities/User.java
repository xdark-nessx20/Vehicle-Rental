package co.edu.unimagdalena.assigment_001.domine.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "full_name ", nullable = false)
    private String fullName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(unique = true)
    private String phone;

    @OneToOne(mappedBy = "user", fetch = FetchType.EAGER)
    private DriverLicense driverLicense;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Set<Reservation> reservations;

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
        reservation.setUser(this);
    }
}
