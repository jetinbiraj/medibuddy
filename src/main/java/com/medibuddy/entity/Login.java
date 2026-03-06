package com.medibuddy.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "login")
public class Login {

    @Id
    @Column(name = "email", nullable = false, unique = true, length = 20)
    private String email;

    @Column(name = "password", nullable = false, length = 20)
    private String password;

    @Column(name = "user_type", nullable = false)
    private String userType;

    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;
}


