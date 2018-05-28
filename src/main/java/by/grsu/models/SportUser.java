package by.grsu.models;

import by.grsu.models.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@DiscriminatorColumn(name = "SU")
public class SportUser extends User {
    private Short height;
    private Float weight;
    private Byte age;
    @Enumerated(value = EnumType.STRING)
    private Gender gender;
}
