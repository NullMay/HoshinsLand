package com.Nullmay.HoshinsLand.Controllers;

import com.Nullmay.HoshinsLand.Config.EncoderConfig;
import com.Nullmay.HoshinsLand.Entities.User;
import com.Nullmay.HoshinsLand.Repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class LoginController extends HttpServlet {

    @Autowired
    private EncoderConfig passwordEncoder;

    @Autowired
    UserRepo userRepo;

    @PostMapping("/login")
    private void Authencticate(HttpServletResponse response, HttpServletRequest request, @RequestParam String username,
    @RequestParam String password)
    throws IOException{

        User dbuser = userRepo.findByUsername(username);
        if (dbuser != null) {
            if (passwordEncoder.encoder().matches(password,dbuser.getPassword())) {
                HttpSession session = request.getSession(true);
            }
            else{
                response.sendError(401,"Wrong credentials.");
            }
        }
        else
            response.sendError(401, "Wrong credentials.");
       }
    }
