package co.edu.unimagdalena.assigment_001.repository;

import co.edu.unimagdalena.assigment_001.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
