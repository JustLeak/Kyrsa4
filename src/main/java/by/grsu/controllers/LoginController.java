package by.grsu.controllers;

import by.grsu.forms.UserForm;
import by.grsu.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @Autowired
    RegistrationService registrationService;

    @GetMapping("/login")
    public String getLoginPage(Authentication authentication, ModelMap modelMap,
                               @RequestParam(value = "error", required = false) String error,
                               @RequestParam(value = "logout", required = false) String logout) {
        if (authentication != null) {
            return "redirect:/hello";
        }

        modelMap.addAttribute("error", error != null);
        modelMap.addAttribute("logout", logout != null);

        return "loginPage";
    }

    @PostMapping("/registration")
    public String registration(UserForm userForm) {
        registrationService.signUp(userForm);
        return "hello";
    }
}
