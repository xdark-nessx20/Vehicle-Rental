package co.edu.unimagdalena.assigment_001.services.repositories;

import co.edu.unimagdalena.assigment_001.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
