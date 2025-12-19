package com.example.demo.service.Impl;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.example.demo.repository.Timestamprepo;
import com.example.demo.entity.Timestamp;
import com.example.demo.service.Timestampservice;



@Service
public class Timestampimpl implements Timestampservice{ //splited as 2 layers here
 @Autowired Timestamprepo timerepo;    
       //save()-insert,update
       //findAll()
       //findByid()
       //deleteById()
       //existsById()       
       @Override
        public Timestamp timeData(Timestamp timesof){
        return timerepo.save(timesof);

}

      



}