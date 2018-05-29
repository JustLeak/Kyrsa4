package by.grsu.services;

import by.grsu.models.Meal;
import by.grsu.models.Product;
import by.grsu.models.User;
import by.grsu.repositories.ProductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductsRepo productsRepo;

    public List<Product> getProductsByMeal(Meal meal){
       return productsRepo.getAllByMeal(meal);
    }
}
