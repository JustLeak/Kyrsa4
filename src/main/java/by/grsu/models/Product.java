package by.grsu.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Product implements ICaloric {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double calories;
    private Double portionWeight;

    @ManyToOne
    @JoinColumn(name = "meal_id")
    private Meal meal;

    @Override
    public double countCalories() {
        return portionWeight * calories;
    }
}
