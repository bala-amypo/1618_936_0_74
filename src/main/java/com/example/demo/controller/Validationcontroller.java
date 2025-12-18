package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Validationentity;
import com.example.demo.service.Validationservice;

@RestController
public class Validationcontroller{
     @Autowired Validationservice ser;    
     
     @PostMapping("/post")
     public Validationentity sendData(@RequestBody Validationentity stu){            //dependency injection
        return ser.postData(stu);
     }   
     @GetMapping("/get")
     public List<Validationentity> getval(){
      return ser.getAllData();
     }        
     @DeleteMapping("/delete/{id}")
     public String deleteval(@PathVariable int id){
      return ser.DeleteData(id);
     }
     @ GetMapping("/getid/{id}")
     public Validationentity getdataid(@PathVariable int id){
      return ser.getData(id);
     }
     @PutMapping("/put/{id}")
     public Validationentity putval(@PathVariable int id,@RequestBody Studententity entity){
      return ser.updateData(id,entity);
     }
}
