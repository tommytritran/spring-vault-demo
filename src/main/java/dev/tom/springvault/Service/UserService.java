package dev.tom.springvault.Service;

import dev.tom.springvault.Modell.User;
import dev.tom.springvault.Repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class UserService {
    private UserRepository repo;

    public User addUser(User user){
        return repo.save(user);
    }

    public Optional<User> getUser(int id){
        return repo.findById(id);
    }
}