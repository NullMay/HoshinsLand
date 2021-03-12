package com.Nullmay.HoshinsLand.Controllers;

import com.Nullmay.HoshinsLand.Entities.User;
import com.Nullmay.HoshinsLand.Repos.UserRepo;
import com.Nullmay.HoshinsLand.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;

import static com.Nullmay.HoshinsLand.Entities.Role.USER;

@Controller
public class TestController {
    @Autowired
    private UserRepo repository;

    @Autowired
    private UserService userService;

    @GetMapping ("/login")
    void ussdfserList() {

//        User savedUser =repository.save(new User("Tests@ml.com", "Tests","Tests", Collections.singleton(USER)));
//        User user2 = repository.save(new User("Naik@gmail.com", "ZDE","12333333", Collections.singleton(USER)));
//        User user3 = repository.save(new User("Naisdfsdk@gmail.com", "FREEE","12werwe", Collections.singleton(USER)));

        System.out.println(userService.findAll());
    }
}
