package com.example.demo.service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.example.demo.repository.Studentrepo;
import com.example.demo.entity.Studententity;
import com.example.demo.service.Studentservice;


@Service
public class Studentserviceimpl implements Studentservice{ //splited as 2 layers here
 @Autowired Studentrepo student;    
       //save()-insert,update
       //findAll()
       //findByid()
       //deleteById()
       //existsById()       
       @Override
        public Studententity postData(Studententity stu){
        return student.save(stu);

}
@Override

       public List<Studententity>getAllData(){
         return student.findAll();
        }
@Override
      public String DeleteData(int id){
            student.deleteById(id);
            return "Deleted Successfully";
      }
}