package by.grsu.forms;

import by.grsu.models.enums.Active;
import by.grsu.models.enums.Gender;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
public class UserForm {
    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private Short height;
    private Float weight;
    private Byte age;
    /*private Active active;*/
   /* private Gender gender;*/
}
