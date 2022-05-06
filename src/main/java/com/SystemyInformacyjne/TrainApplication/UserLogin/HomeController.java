package com.SystemyInformacyjne.TrainApplication.UserLogin;

import com.SystemyInformacyjne.TrainApplication.UserRegistration.UserRegistrationController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    UserRegistrationController userRegistrationController;

    @GetMapping("/home")
    public String home(){
        return "This is home page";
    }
    @GetMapping("/admin")
    public String admin(){
        return "This is admin page";
    }
    @GetMapping("/registration")
    public UserRegistrationController registration(){
        return userRegistrationController;
    }


}
