package com.example.TesteCilia.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    @Column(nullable = false, updatable = false)
    private String clientCode;

    public Client() {}

    public Client(String name, String email, String clientCode){
        this.name = name;
        this.email = email;
        this.clientCode = clientCode;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getClientCode(){
        return clientCode;
    }

    public void setClientCode(String clientCode){
        this.clientCode = clientCode;
    }

    @Override
    public String toString(){
        return "Client{"   +
                "Id="      + id +
                "name="    + name + '\'' +
                "email="   + email + '\'' +
                '}';
    }
}
