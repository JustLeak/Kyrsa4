package by.grsu.models.enums;

public enum Active {
    SEDENTARY(1.200, "Little or no exercise"),
    LIGHTLY(1.375, "Light exercise/sports 1-3 days/week"),
    MODERATELY(1.550, "Moderate exercise/sports 3-5 days/week"),
    VERY(1.725, "Hard exercise/sports 6-7 days a week"),
    EXTRA(1.900, "Very hard exercise/sports and physical job");

    double activityLevel;
    String description;

    Active(double activityLevel, String description) {
        this.activityLevel = activityLevel;
        this.description = description;
    }

    double getActivityLevel() {
        return activityLevel;
    }
}
