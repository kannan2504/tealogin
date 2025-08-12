package com.cofee.tealogin.Controller;

import com.cofee.tealogin.model.contact;
import com.cofee.tealogin.repository.contactRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class contactController {

    @Autowired
    contactRepository contactrepo;

    @PostMapping("/contact")
    public ResponseEntity<String> saveFeedback(@RequestBody contact contact){
        contactrepo.save(contact);
        return ResponseEntity.ok("Message received !We reach out you soon");

    }

}
