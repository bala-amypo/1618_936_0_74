package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import jakarta.validation.Valid;

import com.example.demo.entity.Validationentity;
import com.example.demo.service.Validationservice;

@RestController
public class Validationcontroller{
     @Autowired Validationservice ser;    
     
     @PostMapping("/post1")
     public Validationentity sendData(@Valid @RequestBody Validationentity stu
     ){            //dependency injection
        return ser.postData(stu);
     }  
     @GetMapping("/findV/{id}")
     public Validationentity getDataval(@PathVariable long id){
      return ser.getData(id);
     } 
     }
    
}