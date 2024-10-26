package com.groupeisi.evaluation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
    @GetMapping(name = "welcome", value = "/")
    public String showWelcome() {
        return "welcome";
    }
}
