package com.app.gym.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
@GetMapping("/contact")
    public String getContactDetails(){
        return "Contact Public Page";
    }
}
