package com.example.demo.service.Impl;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.example.demo.repository.Studentrepo;
import com.example.demo.entity.Studententity;
import com.example.demo.service.Studentservice;

@Override
@Service
public class Studentserviceimpl implements Studentservice{ //splited as 2 layers here
 @Autowired Studentrepo student;    
       //save()-insert,update
       //findAll()
       //findByid()
       //deleteById()
       //existsById()       
        public Studententity postData(Studententity stu);
        return student.save(stu);
}