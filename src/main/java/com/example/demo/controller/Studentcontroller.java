package com.example.demo.controller;


import org.springframework.web.bind.annotation.RestController;


@RestController
public class Studentcontroller{
     @Autowired Studentservice ser;                                     //dependency injection
}