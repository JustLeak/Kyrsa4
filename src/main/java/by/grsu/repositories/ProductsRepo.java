package by.grsu.repositories;

import by.grsu.models.Meal;
import by.grsu.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductsRepo extends JpaRepository<Product, Long> {
    List<Product> getAllByMeal(Meal meal);
}
