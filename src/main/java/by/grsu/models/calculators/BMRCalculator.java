package by.grsu.models.calculators;

import by.grsu.models.SportUser;
import by.grsu.models.enums.Gender;

public class BMRCalculator {


    static double getBMR(SportUser user) {
        double a = 10 * user.getWeight();
        double b = 6.25 * user.getHeight();
        double c = 5 * user.getAge();

        if (user.getGender().equals(Gender.MALE)) {
            double BMR = a + b;
            BMR -= c + 5;
        } else {
            double BMR = a + b;
            BMR -= c - 161;
        }
        return 0;
    }
}
