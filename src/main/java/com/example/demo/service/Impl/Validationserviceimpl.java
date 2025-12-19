package com.example.demo.service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.example.demo.repository.Validationrepo;
import com.example.demo.entity.Validationentity;
import com.example.demo.service.Validationservice;
import com.example.demo.exception.Validationexception;


@Service
public class Validationserviceimpl implements Validationservice{ //splited as 2 layers here
 @Autowired Validationrepo student;    
       //save()-insert,update
       //findAll()
       //findByid()
       //deleteById()
       //existsById()       
       @Override
        public Validationentity postData(Validationentity stu){
        return student.save(stu);

}

      @Override
        public Validationentity getData(long id){
        return student.findById(id).orElseThrow(()->new Validationexception("Invalid Id" + id));



}


}