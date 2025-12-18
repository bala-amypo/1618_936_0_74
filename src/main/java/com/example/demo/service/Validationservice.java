package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Validationentity;

public interface  Validationservice{
     Validationentity postData(Validationentity stu);

     List<Validationentity>getAllData();
     String DeleteData(int id);
      Validationentity getData(int id);
 Validationentity updateData(int id,Validationentity entity);

     
}