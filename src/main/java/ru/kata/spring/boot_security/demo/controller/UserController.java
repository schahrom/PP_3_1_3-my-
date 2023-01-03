package ru.kata.spring.boot_security.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.kata.spring.boot_security.demo.model.UserEntity;
import ru.kata.spring.boot_security.demo.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/people")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/list")
    public String listUser(Model model) {
        List<UserEntity> allUser = userService.getAllUser();
        model.addAttribute("allUser", allUser);
        return "list-user";
    }

    @GetMapping("/new")
    public String newUserEntity(Model model) {
        model.addAttribute("user", new UserEntity());
        return "user-info";
    }

    @PostMapping()
    public String create(@ModelAttribute("user") UserEntity userEntity) {
        userService.save(userEntity);
        return "redirect:/people/list";

    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable("id") Long id) {
        model.addAttribute("user", userService.show(id));
        return "edit";
    }

    @PostMapping ("/{id}")
    public String update(@ModelAttribute("user") UserEntity userEntity,
                         @PathVariable("id") Long id) {
        userService.update(id, userEntity);
        return "redirect:/people/list";

    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
        userService.delete(id);
        return "redirect:/people/list";
    }
}

