package com.sofka.spacialStationSofka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to my API for SofkaU";
    }
}
