package com.app.gym.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GymController {
    @GetMapping("/home")
    public String getDetails(){
        return "Gym Home Page";
    }

    @GetMapping("/subscription")
    public String getSubscription(){
        return "Subscription List";
    }
}
