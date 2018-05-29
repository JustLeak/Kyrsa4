package by.grsu.repositories;

import by.grsu.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Long> {
    List<User> findAll();

    Optional<User> findOneByLogin(String login);
}
