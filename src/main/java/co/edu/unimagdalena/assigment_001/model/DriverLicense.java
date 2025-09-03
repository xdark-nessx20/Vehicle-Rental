package co.edu.unimagdalena.assigment_001.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "driver_licenses")
@AllArgsConstructor
@NoArgsConstructor
public class DriverLicense {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "driver_license_id")
    private Long id;

    @Column(name = "license_number", nullable = false, unique = true)
    private String licenseNumber;

    @Column(nullable = false)
    private String category;

    @Column(name = "issued_at", nullable = false)
    private LocalDate issuedAt;

    @Column(name = "expires_at", nullable = false)
    private LocalDate expiresAt;

    @OneToOne(optional = false)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
}
