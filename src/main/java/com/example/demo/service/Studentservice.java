package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Studententity;

public interface  Studentservice{
     Studententity postData(Studententity stu);

     List<Studententity>getAllData();
     String DeleteData(int id);
      Studententity
     
}