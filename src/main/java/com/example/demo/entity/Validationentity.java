package com.example.demo.entity;


import jakarta.persistence.Entity;

@Entity
public class Validationentity(){

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;
    private String password;
    private Integer age;

}