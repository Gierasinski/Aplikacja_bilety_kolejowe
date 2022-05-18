package com.SystemyInformacyjne.TrainApplication.Jwt.controllers;

import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
//@RequestMapping("/apis")
public class SocialController {

    @GetMapping("/")
    public String helloWorld() {
        return "hello word";
    }

    @GetMapping("/home")
    public String restricted() {
        return "zalogowany";
    }
}
