package com.codeup.springblog.controllers;

import com.codeup.springblog.Models.User;
import com.codeup.springblog.services.UserSvc;
import com.codeup.springblog.services.UsersRepo;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    private UserSvc userSvc;
    private PasswordEncoder passwordEncoder;

    public UserController(UserSvc users, PasswordEncoder passwordEncoder) {
        this.userSvc = users;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/sign-up")
    public String showSignupForm(Model model){
        model.addAttribute("user", new User());
        return "users/sign-up";
    }

    @PostMapping("/sign-up")
    public String saveUser(@ModelAttribute User user){
        String hash = passwordEncoder.encode(user.getPassword());
        user.setPassword(hash);
        userSvc.save(user);
        return "redirect:/login";
    }
}
