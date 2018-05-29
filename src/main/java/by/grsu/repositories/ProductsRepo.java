package by.grsu.repositories;

import by.grsu.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepo extends JpaRepository<Product, Long> {
}
