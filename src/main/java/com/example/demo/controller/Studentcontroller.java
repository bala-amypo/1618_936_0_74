package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Studententity;
import com.example.demo.service.Studentservice;

@RestController
public class Studentcontroller{
     @Autowired Studentservice ser;    
     
     @PostMapping("/post")
     public Studententity sendData(@RequestBody Studententity stu){            //dependency injection
        return ser.postData(stu);
     }   
     @GetMapping("/get")
     public List<Studententity> getval(){
      return ser.getAllData();
     }        
     @DeleteMapping("/delete/{id}")
     public String deleteval(@PathVariable int id){
      return ser.DeleteData(id);
     }
     @ GetMapping("/getid/{id}")
     public Studententity getdataid(@PathVariable int id){
      return ser.getData(id).orElse(null);
     }
}