package com.app.gym.api.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class User {
    private int id;
    private String firstName;
    private String secondName;
    private String userName;
    private String email;
    private String password;
    private String role;
}
