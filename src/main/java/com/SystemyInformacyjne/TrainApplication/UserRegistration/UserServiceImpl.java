package com.SystemyInformacyjne.TrainApplication.UserRegistration;

import com.SystemyInformacyjne.TrainApplication.UserLogin.User;
import com.SystemyInformacyjne.TrainApplication.UserLogin.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements  UserService{


    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(registrationDto.getUsername(), registrationDto.getPassword(),"USER" );

        return userRepository.save(user);
    }
}
