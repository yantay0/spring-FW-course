package com.madina.springauthenticator.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.jpa

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;
    private String password;

    private Set<Role> roles = new HashSet<>();

}
