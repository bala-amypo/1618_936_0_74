package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Studentservice;

@RestController
public class Studentcontroller{
     @Autowired Studentservice ser;                                 //dependency injection
}