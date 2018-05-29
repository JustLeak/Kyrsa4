package by.grsu.models;

import by.grsu.models.enums.Active;
import by.grsu.models.enums.Gender;
import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
@Entity
@ToString
@Table(name = "sport_details")
public class SportDetails {
    @Id
    @Column(name = "detailId_PK")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Short height;
    private Float weight;
    private Byte age;
    @Enumerated(value = EnumType.STRING)
    private Active active;
    @Enumerated(value = EnumType.STRING)
    private Gender gender;


}
