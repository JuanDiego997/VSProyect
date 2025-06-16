package com.vsptours.alfa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/authlogin")
public class AuthController {

    @GetMapping
    public String showLoginPage() {
        return "authlogin";
    }

    @PostMapping
    public String processLogin() {
        return "redirect:/intranet";
    }
}
