package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.PathVariable;

import jakarta.validation.Valid;

import com.example.demo.entity.Timestamp;
import com.example.demo.service.Timestampservice;

@RestController
public class Timestampcontroller{
     @Autowired Timestampservice ser;    
     
     @PostMapping("/postT")
     public Timestamp tData(@Valid @RequestBody Timestamp timesof){
                    //dependency injection
        return ser.timeData(timesof);
     }  
     
     
    
}