package by.grsu.controllers;

import by.grsu.models.SportDetails;
import by.grsu.models.User;
import by.grsu.models.enums.Active;
import by.grsu.models.enums.Gender;
import by.grsu.models.enums.Role;
import by.grsu.models.enums.State;
import by.grsu.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
   /* @Autowired
    UsersRepository usersRepository;*/

    @RequestMapping("/")
    public String getMainPage(Authentication authentication) {
 /*       SportDetails sportDetails = SportDetails.builder().weight(68.8F)
                .height((short) 180)
                .gender(Gender.MALE)
                .age((byte) 19)
                .active(Active.MODERATELY)

                .build();
        User user = User.builder().sportDetails(sportDetails)

                .state(State.ACTIVE)
                .role(Role.ADMIN)
                .login("leekers@yandex.ru")
                .hashPassword("$2a$10$qOU/SHupAj.rVMbm2CrUo.4utzzVgEhLHBeEFlOBmgVNBTVdDasvq")
                .lastName("Fraiman")
                .firstName("Jenia")
                .build();
        usersRepository.save(user);*/
        if(authentication == null) {
            return "redirect:/login?noAuth";
        }
        //System.out.println(usersRepository.findOneByLogin("leekers@yandex.ru").get().getSportDetails().getActive());
        return "redirect:/meals";
    }

    @GetMapping ("/hello")
    public String getStarted(Authentication authentication) {

        return "hello";
    }

}
