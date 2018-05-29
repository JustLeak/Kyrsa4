package by.grsu.repositories;

import by.grsu.models.Meal;
import by.grsu.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MealRepo extends JpaRepository<Meal, Long> {
    List<Meal> getAllByUser(User user);
}
