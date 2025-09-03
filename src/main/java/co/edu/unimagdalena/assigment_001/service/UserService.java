package co.edu.unimagdalena.assigment_001.service;

import co.edu.unimagdalena.assigment_001.model.User;
import co.edu.unimagdalena.assigment_001.repository.UserRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Transactional
    public List<User> saveAllUsers(List<User> users) {
        return userRepository.saveAll(users);
    }

    public User findUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Transactional
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Transactional
    public void deleteAllUsers() {
        userRepository.deleteAll();
    }



}
