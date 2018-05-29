package by.grsu.services;

import by.grsu.forms.UserForm;
import by.grsu.models.SportDetails;
import by.grsu.models.User;
import by.grsu.models.enums.Active;
import by.grsu.models.enums.Gender;
import by.grsu.models.enums.Role;
import by.grsu.models.enums.State;
import by.grsu.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    @Autowired
    UsersRepository usersRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public void signUp(UserForm userForm) {
        String hashPassword = passwordEncoder.encode(userForm.getPassword());

        SportDetails sportDetails = SportDetails.builder().weight(userForm.getWeight())
                .height(userForm.getHeight())
                .gender(Gender.valueOf(userForm.getGender()))
                .age(userForm.getAge())
                .active(Active.MODERATELY)
                .build();

        User user = User.builder().sportDetails(sportDetails)

                .state(State.ACTIVE)
                .role(Role.USER)
                .login(userForm.getLogin())
                .hashPassword(hashPassword)
                .lastName(userForm.getLastName())
                .firstName(userForm.getFirstName())
                .build();

        usersRepository.save(user);
    }
}
