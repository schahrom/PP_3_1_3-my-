package ru.kata.spring.boot_security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.repository.UserRepository;

import java.security.Principal;
@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;



    @RequestMapping("/user")
    public String mainPageUserInfo(Model model, Principal principal) {
        User user = userRepository.findByUsername(principal.getName());
        model.addAttribute("userModel", user);
        return "user";
    }
}
