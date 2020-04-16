package dev.tom.springvault.Repositories;

import dev.tom.springvault.Modell.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
