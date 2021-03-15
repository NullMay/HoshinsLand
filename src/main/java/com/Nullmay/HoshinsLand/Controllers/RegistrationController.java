package com.Nullmay.HoshinsLand.Controllers;

import com.Nullmay.HoshinsLand.Entities.Role;
import com.Nullmay.HoshinsLand.Entities.User;
import com.Nullmay.HoshinsLand.Repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;


@RequestMapping("/registration")
@RestController
public class RegistrationController {
    @Autowired
    private UserRepo userRepo;
//getrid
    @GetMapping
    public String registration() {
        return "registration";
    }

    @PostMapping
    public void addUser(@RequestBody User user, Model model) {
        User userFromDb = userRepo.findByUsername(user.getUsername());

        if (userFromDb != null) {
            model.addAttribute("message", "User exists!");
        }

        user.setRoles(Collections.singleton(Role.USER));
        userRepo.save(user);

    }

}
