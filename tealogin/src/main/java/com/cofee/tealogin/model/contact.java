package com.cofee.tealogin.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class contact {



    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;
    private Long number;
    private String message;
}
