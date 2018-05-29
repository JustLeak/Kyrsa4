package by.grsu.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.List;
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

    @OneToMany(mappedBy = "meal", cascade = CascadeType.ALL)
    private Set<Product> products;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Override
    public double countCalories() {
        Double calories = 0D;
        for (Product product : products) {
            calories += product.countCalories();

        }
        return calories;
    }
    /*private Date date;*/
}
