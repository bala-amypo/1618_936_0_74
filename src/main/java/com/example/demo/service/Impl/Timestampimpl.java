package com.example.demo.service;

public class Timestampimpl{
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.example.demo.repository.Timestamprepo;
import com.example.demo.entity.Timestamp;
import com.example.demo.service.Timestampservice;
import com.example.demo.exception.Timestampexception;


@Service
public class Timestampserviceimpl implements Timestampservice{ //splited as 2 layers here
 @Autowired Timestamprepo timerepo;    
       //save()-insert,update
       //findAll()
       //findByid()
       //deleteById()
       //existsById()       
       @Override
        public Timestampentity (Validationentity stu){
        return timerepo.save(stu);

}

      



}