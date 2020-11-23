package com.Nullmay.HoshinsLand.Controllers;

import com.Nullmay.HoshinsLand.Entities.Role;
import com.Nullmay.HoshinsLand.Entities.User;
import com.Nullmay.HoshinsLand.Repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;

@RequestMapping("/registration")
@Controller
public class RegistrationController {
    @Autowired
    private UserRepo userRepo;

    @GetMapping
    public String registration() {
        return "registration";
    }

    @PostMapping
    public String addUser(User user, Model model) {
        User userFromDb = userRepo.findByUsername(user.getUsername());

        if (userFromDb != null) {
            model.addAttribute("message", "User exists!");
            return "registration";
        }

        user.setRoles(Collections.singleton(Role.USER));
        userRepo.save(user);

        return "redirect:/login";
    }

}
