package com.nexus_user_service.nus.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name= "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String name;

    @Column(nullable = false, unique = true)
    @Email
    private String email;

    @Column(nullable = false)
    private String password;

    protected Client(){}

    public Client(String name, String email, String password){
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public Integer getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPassword(){
        return this.password;
    }
}
