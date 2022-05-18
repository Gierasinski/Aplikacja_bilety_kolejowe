package com.SystemyInformacyjne.TrainApplication.Social;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/social")
public class SocialController {

//    @GetMapping("/")
//    public String helloWorld() {
//        return "hello word";
//    }

    @GetMapping("/")
    public String restricted() {
        return "zalogowany";
    }
}
