package co.edu.unimagdalena.assigment_001.domine.repositories;

import co.edu.unimagdalena.assigment_001.domine.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
