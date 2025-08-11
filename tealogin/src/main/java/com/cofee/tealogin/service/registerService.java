package com.cofee.tealogin.service;

import com.cofee.tealogin.model.User;
import com.cofee.tealogin.repository.registerRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
@AllArgsConstructor
public class registerService {
    @Autowired
    registerRepository registerRepo;

    public boolean register(User user) {
        if (registerRepo.existsByEmail(user.getEmail())) {
            return false;
        }
        registerRepo.save(user);
        return true;

    }

    public String authenticate(String email,String Password){
        Optional<User> existsuser=registerRepo.findByEmail(email);

        if(existsuser==null){
            return "Not Registered";
        }
        if(!existsuser.get().getPassword().equals(Password)){
            return "Invalid password";
        }

        return "Success";
    }
}
