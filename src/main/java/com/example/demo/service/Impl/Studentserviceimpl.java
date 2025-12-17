package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Studententity;
import com.example.demo.service.Studentservice;

@Service
public class Studentserviceimpl implements Studentservice{ 
 @Autowired Studentrepo student;    
       //save()
       //findAll()
       //findByid()
       //deleteBy       
        public Studententity postData(Studententity stu);
}