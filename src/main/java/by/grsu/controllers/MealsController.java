package by.grsu.controllers;

import by.grsu.models.Meal;
import by.grsu.models.Product;
import by.grsu.models.User;
import by.grsu.models.calculators.BMRCalculator;
import by.grsu.services.MealsService;
import by.grsu.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MealsController {
    @Autowired
    MealsService mealsService;

    @Autowired
    ProductService productService;

    @GetMapping("/meals")
    public String getMealsPage(Authentication authentication, ModelMap modelMap) {
        if (authentication == null) {
            return "redirect:/login?noAuth";
        }


        User details = (User) authentication.getPrincipal();
        List<Meal> meals = mealsService.getMealsByUser(details);
        List<Product> products = new ArrayList<>();
        for (Meal meal : meals) {
            meal.countCalories();
            products.addAll(productService.getProductsByMeal(meal));
        }

        modelMap.addAttribute("mealsFromServer", meals);

        modelMap.addAttribute("bmr", BMRCalculator.getBMR(details.getSportDetails()).toString());
        modelMap.addAttribute("bmrweek", String.valueOf(BMRCalculator.getBMR(details.getSportDetails()) * 7));


        return "mealsPage";
    }
}
