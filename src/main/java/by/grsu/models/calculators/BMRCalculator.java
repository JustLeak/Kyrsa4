package by.grsu.models.calculators;
import by.grsu.models.SportDetails;
import by.grsu.models.enums.Gender;

public class BMRCalculator {
    static double getBMR(SportDetails details) {
        double a = 10 * details.getWeight();
        double b = 6.25 * details.getHeight();
        double c = 5 * details.getAge();

        if (details.getGender().equals(Gender.MALE)) {
            double BMR = a + b;
            BMR -= c + 5;
        } else {
            double BMR = a + b;
            BMR -= c - 161;
        }
        return 0;
    }
}
