package com.laptrinhb2a.app.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@EnableAutoConfiguration
@Controller
public class ContactController {

    @GetMapping(value = "/contact")
    public String showContactPage(){
        return "contact";
    }
}
