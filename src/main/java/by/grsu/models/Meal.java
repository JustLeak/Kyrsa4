package by.grsu.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Data
@Entity
public class Meal implements ICaloric {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double calories;
    private String imageAddress;
    @OneToMany(mappedBy = "meal", cascade = CascadeType.ALL)
    private List<Product> products;

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
