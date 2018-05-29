package by.grsu.services;

import by.grsu.models.Meal;
import by.grsu.models.User;
import by.grsu.repositories.MealRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@Service
public class MealsService {
    @Autowired
    MealRepo mealRepo;

    public List<Meal> getMealsByUser(User user){
        return mealRepo.getAllByUser(user);

    }


}
