package by.grsu.forms;

import lombok.Data;

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
    private String gender;
}
