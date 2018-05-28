package by.grsu.repositories;

import by.grsu.models.SportUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<SportUser, Long> {
    List<SportUser> findAllByFirstName(String firstName);

    List<SportUser> findAll();

    Optional<SportUser> findOneByLogin(String login);
}
