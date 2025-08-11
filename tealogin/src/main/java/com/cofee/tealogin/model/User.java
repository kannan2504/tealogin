package com.cofee.tealogin.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cofeeRegist")
public class User {

@Id
    @GeneratedValue
    private Long id;
    private String email;
    private String password;
    private long phno;
    }
