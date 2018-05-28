package by.grsu.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String getLoginPage(Authentication authentication, ModelMap modelMap, HttpServletRequest httpServletRequest, HttpServletResponse response) {
        if (authentication != null) {
            return "redirect:/hello";
        }

        if (httpServletRequest.getParameterMap().containsKey("error")) {
            modelMap.addAttribute("error", true);
        }

        return "loginPage";
    }
}
