package com.Nullmay.HoshinsLand.Controllers;

import com.Nullmay.HoshinsLand.Config.EncoderConfig;
import com.Nullmay.HoshinsLand.Entities.User;
import com.Nullmay.HoshinsLand.Repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.http.HttpRequest;

@Controller
public class LoginController extends HttpServlet {

    @Autowired
    private EncoderConfig passwordEncoder;

    @Autowired
    UserRepo userRepo;

    @PostMapping("/login")
    private void Authencticate(User user, HttpServletRequest request, HttpServletResponse response)
    throws IOException{


        User dbuser = userRepo.findByUsername(user.getUsername());
        if (user != null) {
            String password = user.getPassword();
            if (passwordEncoder.encoder().encode(user.getPassword()).equals(dbuser.getPassword())) {
                HttpSession newSession = request.getSession(true);
            }
        }
        else
            response.sendError(401, "Wrong credentials.");
       }
    }
