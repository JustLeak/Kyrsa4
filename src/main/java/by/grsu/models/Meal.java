package by.grsu.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Meal implements ICaloric {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double calories;

    @OneToMany(mappedBy = "meal", cascade = CascadeType.ALL)
    private Set<Product> products;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Override
    public double countCalories() {
        calories = 0d;
        for (Product product : products) {
            calories += product.countCalories();
        }
        return calories;
    }
}
