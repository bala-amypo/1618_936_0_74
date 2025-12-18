package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Studententity;
import com.example.demo.service.Studentservice;

@RestController
public class Studentcontroller{
     @Autowired Studentservice ser;    
     
     @PostMapping("/post")
     public Studententity sendData(@RequestBody Studententity stu){            //dependency injection
        return ser.postData(stu);
     }                            
}