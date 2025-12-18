package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Validationentity;

public interface  Validationservice{
     Validationentity postData(Validationentity val);

    Validationentity getData(long id);
}