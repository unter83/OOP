package controller;

import model.User;
import repository.GBRepository;

import java.util.List;
import java.util.Objects;

public class UserController {
    private final GBRepository<User, Long> repository;
    // private Exeption exeption;

    public UserController(GBRepository<User, Long> repository) {
        this.repository = repository;
    }

    public void saveUser(User user) {
        repository.create(user);
    }

    public User readUser(Long userId) throws Exception {
        List<User> users = repository.findAll();
        for (User user : users) {
            if (Objects.equals(user.getId(), userId)) {
                return user;
            }
        }
        // exeption.idNotFound(userId);
        // return null;
        throw new RuntimeException("User not found");
    }

    public User findUserById(long id) {
        User user = repository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        return user;
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }

    public boolean update(Long id, User update) {
        try {
            repository.update(id, update);
            return true;
        } catch (Exception e) {
            // exeption.idNotFound(id);
            throw new RuntimeException(e);
        }
    }

    public boolean delete(Long id) {
        try {
            repository.delete(id);
            return true;
        } catch (Exception e) {
            // exeption.idNotFound(id);
            throw new RuntimeException(e);
        }
    }
}
