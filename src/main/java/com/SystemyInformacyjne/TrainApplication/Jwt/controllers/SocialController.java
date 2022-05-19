package com.SystemyInformacyjne.TrainApplication.Jwt.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
//@RequestMapping("/apis")
public class SocialController {

    @GetMapping("/")
    public String helloWorld() {
        return "hello word";
    }

//    @GetMapping("/home")
//    public String restricted() {
//        return "zalogowany";
//    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public void method(HttpServletResponse httpServletResponse) {
        httpServletResponse.setHeader("Location", "http://localhost:3000/home");
       httpServletResponse.setStatus(302);
    }
}
