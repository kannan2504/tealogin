package com.cofee.tealogin.Controller;

import com.cofee.tealogin.model.User;
import com.cofee.tealogin.service.registerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class registerController {
    @Autowired
    registerService registerservice;
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user){
    if(registerservice.register(user)){

        return ResponseEntity.ok("Registeration successfull");
    }
    return ResponseEntity.status(HttpStatus.CONFLICT).body("Email aldready exists");

    }


    @PostMapping("/login")
        public ResponseEntity<String > login (@RequestBody User user)
    {


            String result=registerservice.authenticate(user.getEmail(), user.getPassword());
        return switch (result) {
            case "Success" -> ResponseEntity.ok("login successfull");
            case "Invalid password" -> ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid  ");
            case "Not Registered" -> ResponseEntity.status(HttpStatus.NOT_FOUND).body("Register now");
            default -> ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong");
        };
    }
}


